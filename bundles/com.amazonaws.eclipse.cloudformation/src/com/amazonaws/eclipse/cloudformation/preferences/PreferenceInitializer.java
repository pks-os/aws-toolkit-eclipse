/*
 * Copyright 2017 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.cloudformation.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.amazonaws.eclipse.cloudformation.CloudFormationPlugin;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

    @Override
    public void initializeDefaultPreferences() {
        EditorPreferences defaultEditorPreferences = EditorPreferences.getDefaultPreferences();
        IPreferenceStore store = CloudFormationPlugin.getDefault().getPreferenceStore();
        EditorPreferencesLoader.loadDefaultPreferences(store, defaultEditorPreferences);
    }
}
