/**
 * Copyright 2010 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.samples.tab.client;

import com.google.gwt.user.client.Window;

import com.gwtplatform.mvp.client.proxy.ProxyFailureHandler;

/**
 * The mechanism by which we let the user know that an code loading
 * operation has failed.
 *
 * @author Christian Goudreau
 */
public class FailureHandlerAlert implements ProxyFailureHandler {
  public FailureHandlerAlert() {
  }

  @Override
  public void onFailedGetPresenter(Throwable caught) {
    Window.alert("Error. Code could not be loaded from server.");
  }
}