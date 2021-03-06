package org.kie.guvnor.testscenario.model;

import java.util.ArrayList;
import java.util.List;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class CollectionFieldData implements Field {

    private String name;

    private List<FieldData> collectionFieldList = new ArrayList<FieldData>();

    @Override
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public List<FieldData> getCollectionFieldList() {
        return collectionFieldList;
    }

    public void setCollectionFieldList(List<FieldData> collectionFieldList) {
        this.collectionFieldList = collectionFieldList;
    }
}
