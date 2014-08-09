package com.example.dbflute.scala.dbflute.bsbhv.cursor;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.CursorHandler;
import com.example.dbflute.scala.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.scala.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;

/**
 * The base class of companion object defined at extended class to create cursor handler.
 * @author DBFlute(AutoGenerator)
 */
abstract class CponBsPurchaseSummaryMemberCursorHandler {
    def apply(handlerCall: (PurchaseSummaryMemberCursor) => Unit): PurchaseSummaryMemberCursorHandler = {
        return new PurchaseSummaryMemberCursorHandler() {
            protected def fetchCursor(cursor: PurchaseSummaryMemberCursor): Object =
            { handlerCall(cursor); return null; }
        }
    }
}

/**
 * The cursor handler of PurchaseSummaryMember.
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchaseSummaryMemberCursorHandler extends CursorHandler {

    /**
     * Handle the cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException
     */
    def handle(rs: ResultSet): Object = {
        return fetchCursor(createTypeSafeCursor(rs));
    }

    /**
     * Create the type-safe cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The created type-safe cursor. (NotNull)
     * @throws SQLException
     */
    protected def createTypeSafeCursor(rs: ResultSet): PurchaseSummaryMemberCursor = {
        val cursor = new PurchaseSummaryMemberCursor();
        cursor.accept(rs);
        return cursor;
    }

    /**
     * Fetch the cursor.
     * @param cursor The type-safe cursor for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException
     */
    protected def fetchCursor(cursor: PurchaseSummaryMemberCursor): Object;
}
