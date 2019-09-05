import java.util.ArrayList;
import java.util.Formatter;

public class createFile {
    private Formatter x;
    public void openFile(String outFileName){
        try{
            x = new Formatter(outFileName);
        }catch(Exception e){
            System.out.println("No can do sir");
        }
    }
    public void addRecords(ArrayList<FacultyMember> facMembers){

        for(FacultyMember facMember: facMembers){
            x.format("Name: %s",facMember.getName());
            x.format("Position: %s",facMember.getPosition());
            x.format("Publications: ");
            for(Publication currentPub: facMember.getPublications()){
                x.format("Authors: %s",currentPub.getAuthors());
                x.format("Title: %s",currentPub.getTitle());
                x.format("Conference/Journal Name: %s",currentPub.getConferenceOrJournalName());
                x.format("Conference Location: %s",currentPub.getConferenceLocation());
                x.format("Year: %s",currentPub.getPublicationDate());
            }

        }

        /*for(int i = 0; i < strings.size();i++){
            x.format("%d ",strings.get(i));
        }*/

    }
    public void close(){
        x.close();
    }
}
