/*
 * Copyright 2000-2013 JetBrains s.r.o.
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
package com.kodokux.github.api;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/**
 * @author Aleksey Pivovarov
 */
@SuppressWarnings({"FieldCanBeLocal", "UnusedDeclaration"})
class GithubRepoRequest {
  @NotNull
  private final String name;
  @NotNull
  private final String description;

  @SerializedName("public") private final boolean isPublic;

  GithubRepoRequest(@NotNull String name, @NotNull String description, boolean aPublic) {
    this.name = name;
    this.description = description;
    isPublic = aPublic;
  }
}