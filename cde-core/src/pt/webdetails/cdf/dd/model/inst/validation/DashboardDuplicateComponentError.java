/*!
 * Copyright 2002 - 2017 Webdetails, a Pentaho company. All rights reserved.
 *
 * This software was developed by Webdetails and is provided under the terms
 * of the Mozilla Public License, Version 2.0, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 */

package pt.webdetails.cdf.dd.model.inst.validation;

public final class DashboardDuplicateComponentError extends ComponentError {
  private final String _componentName;

  public DashboardDuplicateComponentError( String componentName, String dashboardName )
      throws IllegalArgumentException {
    super( dashboardName, "Dashboard" );

    if ( componentName == null ) {
      throw new IllegalArgumentException( "componentName" );
    }

    this._componentName = componentName;
  }

  public String getComponentName() {
    return this._componentName;
  }

  @Override
  public String toString() {
    return "Dashboard of id '" + this._componentId + " has a duplicate component with name '" + this._componentName
      + "'.";
  }
}
