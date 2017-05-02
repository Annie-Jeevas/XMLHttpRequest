package entities;

import entities.Sportsman;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-17T00:28:08")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, Long> id;
    public static volatile SingularAttribute<Team, String> teamName;
    public static volatile SingularAttribute<Team, String> icon;
    public static volatile ListAttribute<Team, Sportsman> members;

}