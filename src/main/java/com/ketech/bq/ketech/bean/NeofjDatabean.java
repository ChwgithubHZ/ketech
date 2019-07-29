package com.ketech.bq.ketech.bean;

import com.ketech.bq.ketech.entity.NoefjCaseEntity;
import com.ketech.bq.ketech.entity.NoefjObjectEntity;
import com.ketech.bq.ketech.entity.NoefjPeopleEntity;
import com.ketech.bq.ketech.entity.NoefjRelation;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: @hw
 * Create:  2019-07-22 13:28
 * Description:
 */
@Data
public class NeofjDatabean {
    private NoefjRelation relationData;

    private  NoefjCaseEntity asjNode;
    private NoefjObjectEntity wpNode;
    private NoefjPeopleEntity peopleNode;


    private  NoefjCaseEntity asjNodeEnd;
    private NoefjObjectEntity wpNodeEnd;
    private NoefjPeopleEntity peopleNodeEnd;

}
