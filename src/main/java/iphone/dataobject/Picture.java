package iphone.dataobject;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

/**
 * Created by huang on 2017/4/2.
 */
@Entity
@Table(name = "picture")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    //@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH }, optional = true)
    // @JoinColumn(name="id")//这里设置JoinColum设置了外键的名字
    //CarInfo carInfo;
    String carid;
    @Column(columnDefinition="MEDIUMTEXT")
    String base;
    String filename;
    String fileaddres;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileaddres() {
        return fileaddres;
    }

    public void setFileaddres(String fileaddres) {
        this.fileaddres = fileaddres;
    }
}
