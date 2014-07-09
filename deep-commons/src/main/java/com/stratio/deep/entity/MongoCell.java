/*
 * Copyright 2014, Stratio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.deep.entity;

import java.nio.ByteBuffer;

import org.apache.cassandra.db.marshal.AbstractType;

/**
 * Created by rcrespo on 2/07/14.
 */
public class MongoCell extends GenericCell{


    private MongoCell (String cellName, Object cellValue){
        super(cellName, cellValue);

    }


    public static Cell create(String cellName, Object cellValue){

        return new MongoCell (cellName, cellValue);
    }


    @Override
    public CellValidator getCellValidator() {
        return null;
    }

    @Override
    public Class getValueType() {
        return null;
    }

    @Override
    public ByteBuffer getDecomposedCellValue() {
        return null;
    }

    @Override
    public Boolean isClusterKey() {
        return null;
    }

    @Override
    public Boolean isPartitionKey() {
        return null;
    }

    @Override
    public AbstractType marshaller() {
        return null;
    }

    @Override
    public String marshallerClassName() {
        return null;
    }
}