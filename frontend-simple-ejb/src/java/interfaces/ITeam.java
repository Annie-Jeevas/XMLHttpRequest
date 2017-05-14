/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Sportsman;
import java.util.ArrayList;
import javax.ejb.Remote;

/**
 *
 * @author Анюта
 */
@Remote
public interface ITeam {

    @Override
    public String toString();

    public Long getId();

    public void setId(Long id);

    public String getIcon();

    public void setIcon(String icon);

    public String getTeamName();

    public void setTeamName(String teamName);

    public ArrayList<Sportsman> getMembers();

    public void setMembers(ArrayList<Sportsman> members);
}
