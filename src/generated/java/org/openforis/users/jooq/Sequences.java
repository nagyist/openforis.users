/*
 * This file is generated by jOOQ.
*/
package org.openforis.users.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in OF_USERS
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>OF_USERS.SYSTEM_SEQUENCE_8A29C84B_9BFE_4DA2_83D3_79C4499BCC20</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_8A29C84B_9BFE_4DA2_83D3_79C4499BCC20 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_8A29C84B_9BFE_4DA2_83D3_79C4499BCC20", OfUsers.OF_USERS, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>OF_USERS.SYSTEM_SEQUENCE_F0058FEC_3719_4A1E_800F_FB978C4B04B6</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_F0058FEC_3719_4A1E_800F_FB978C4B04B6 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_F0058FEC_3719_4A1E_800F_FB978C4B04B6", OfUsers.OF_USERS, org.jooq.impl.SQLDataType.BIGINT);
}
