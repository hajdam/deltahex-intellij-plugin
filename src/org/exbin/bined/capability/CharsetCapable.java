/*
 * Copyright (C) ExBin Project
 *
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
package org.exbin.bined.capability;

import java.nio.charset.Charset;
import javax.annotation.Nonnull;

/**
 * Support for charset capability.
 *
 * @version 0.2.0 2017/11/12
 * @author ExBin Project (https://exbin.org)
 */
public interface CharsetCapable {

    /**
     * Returns currently used charset.
     *
     * @return charset
     */
    @Nonnull
    Charset getCharset();

    /**
     * Sets charset to use for characters decoding.
     *
     * @param charset charset
     */
    void setCharset(@Nonnull Charset charset);

    public static class CharsetCapability implements CodeAreaCapability {

    }
}