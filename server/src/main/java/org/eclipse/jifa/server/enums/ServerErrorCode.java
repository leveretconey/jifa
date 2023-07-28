/********************************************************************************
 * Copyright (c) 2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
package org.eclipse.jifa.server.enums;

import org.eclipse.jifa.common.domain.exception.ErrorCode;

public enum ServerErrorCode implements ErrorCode {
    UNAVAILABLE("Unavailable"),
    ACCESS_DENIED("Access denied"),
    UNSUPPORTED_NAMESPACE("Unsupported namespace"),
    UNSUPPORTED_API("Unsupported API"),
    FILE_NOT_FOUND("File not found"),
    FILE_DELETED("File deleted"),
    FILE_TRANSFER_INCOMPLETE("File transfer incomplete"),
    FILE_TYPE_MISMATCH("File type mismatch"),
    STATIC_WORKER_UNAVAILABLE("Static worker Unavailable"),

    ELASTIC_WORKER_NOT_READY("Elastic worker not ready"),
    ELASTIC_WORKER_STARTUP_FAILURE("Elastic worker startup failure");

    private final String message;

    ServerErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String message() {
        return message;
    }
}