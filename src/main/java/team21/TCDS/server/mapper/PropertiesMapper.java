package team21.TCDS.server.mapper;

import team21.TCDS.server.model.Propertie;

public interface PropertiesMapper {

    int insert(final Propertie p);

    int deleteByKey(final String propertieKey);

    Propertie selectByKey(final String propertieKey);

    int update(final Propertie p);

}
