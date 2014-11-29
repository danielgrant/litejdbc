package com.github.danielgrant.litejdbc.exception;

/*
 * Copyright 2014 LiteJDBC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.sql.SQLException;

public class ExceptionTranslator {

    public static DataAccessException translateSQLException(String task, SQLException sqlException) {
        return new DataAccessSQLException(task, sqlException);
    }

    public static DataAccessException translateReflectionException(String task, Class<?> clazz, Exception exception) {
        return new DataAccessReflectionException(task, clazz, exception);
    }
}
