/** 
 * Copyright [2013] Antonio J. Iniesta
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
 * 
 * File created: 01/02/2013 at 23:50:32 by antonio
 */
package com.iniesta.layerfx;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author antonio
 * This interface has methods to being able of Handling the 
 * Views and make generic loads of the JavaFX controllers in FXMLLoader
 */
public interface HandlingView {

	/**
	 * Set the stage of the view if it is a window.
	 */
	public void setStage(Stage stage);
	
	/**
	 * Return the main content of the view
	 * @return
	 */
	public Pane getMainPane();
}
