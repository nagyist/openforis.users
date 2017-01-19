/*
 * This file is generated by jOOQ.
*/
package org.openforis.users.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.openforis.users.jooq.tables.OfUserGroup;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OfUserGroupRecord extends UpdatableRecordImpl<OfUserGroupRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = -718751018;

    /**
     * Setter for <code>OF_USERS.OF_USER_GROUP.USER_ID</code>.
     */
    public void setUserId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER_GROUP.USER_ID</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>OF_USERS.OF_USER_GROUP.GROUP_ID</code>.
     */
    public void setGroupId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER_GROUP.GROUP_ID</code>.
     */
    public Long getGroupId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>OF_USERS.OF_USER_GROUP.STATUS_CODE</code>. P=Pending, A=Accepted, R=Rejected
     */
    public void setStatusCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER_GROUP.STATUS_CODE</code>. P=Pending, A=Accepted, R=Rejected
     */
    public String getStatusCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>OF_USERS.OF_USER_GROUP.ROLE_CODE</code>. OWN=Owner, ADM=Administrator, OPR=Operator, VWR=Viewer
     */
    public void setRoleCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER_GROUP.ROLE_CODE</code>. OWN=Owner, ADM=Administrator, OPR=Operator, VWR=Viewer
     */
    public String getRoleCode() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return OfUserGroup.OF_USER_GROUP.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return OfUserGroup.OF_USER_GROUP.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OfUserGroup.OF_USER_GROUP.STATUS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OfUserGroup.OF_USER_GROUP.ROLE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStatusCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRoleCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserGroupRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserGroupRecord value2(Long value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserGroupRecord value3(String value) {
        setStatusCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserGroupRecord value4(String value) {
        setRoleCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserGroupRecord values(Long value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OfUserGroupRecord
     */
    public OfUserGroupRecord() {
        super(OfUserGroup.OF_USER_GROUP);
    }

    /**
     * Create a detached, initialised OfUserGroupRecord
     */
    public OfUserGroupRecord(Long userId, Long groupId, String statusCode, String roleCode) {
        super(OfUserGroup.OF_USER_GROUP);

        set(0, userId);
        set(1, groupId);
        set(2, statusCode);
        set(3, roleCode);
    }
}