/*
 *  Copyright 2021 the original author, Lam Tong
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.github.easylock.client.error;

import io.github.easylock.common.request.Request;

/**
 * Enumerations for {@link Request} errors.
 *
 * @author Lam Tong
 * @version 1.0.0
 * @since 1.0.0
 */
public enum RequestError {

    EMPTY_LOCK_KEY("Lock key should not be null or empty, reset lock key."),

    LOCKING_ALREADY("Locking succeeds already, lock cancels."),

    LOCKING_FAIL("Locking fails before, unlock cancels."),

    UNLOCKING_ALREADY("Unlocking succeeds already, unlock cancels.");

    private final String message;

    RequestError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
