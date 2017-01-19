/*
 * This file is generated by jOOQ.
*/
package org.openforis.users.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.openforis.users.jooq.tables.OfUser;


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
public class OfUserRecord extends UpdatableRecordImpl<OfUserRecord> implements Record4<Long, String, String, Boolean> {

    private static final long serialVersionUID = -1018111206;

    /**
     * Setter for <code>OF_USERS.OF_USER.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>OF_USERS.OF_USER.USERNAME</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER.USERNAME</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>OF_USERS.OF_USER.PASSWORD</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER.PASSWORD</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>OF_USERS.OF_USER.ENABLED</code>.
     */
    public void setEnabled(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_USER.ENABLED</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return OfUser.OF_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OfUser.OF_USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OfUser.OF_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return OfUser.OF_USER.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserRecord value4(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserRecord values(Long value1, String value2, String value3, Boolean value4) {
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
     * Create a detached OfUserRecord
     */
    public OfUserRecord() {
        super(OfUser.OF_USER);
    }

    /**
     * Create a detached, initialised OfUserRecord
     */
    public OfUserRecord(Long id, String username, String password, Boolean enabled) {
        super(OfUser.OF_USER);

        set(0, id);
        set(1, username);
        set(2, password);
        set(3, enabled);
    }
}