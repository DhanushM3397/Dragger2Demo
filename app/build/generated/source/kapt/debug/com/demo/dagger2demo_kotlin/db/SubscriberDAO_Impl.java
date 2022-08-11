package com.demo.dagger2demo_kotlin.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SubscriberDAO_Impl implements SubscriberDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Subscriber> __insertionAdapterOfSubscriber;

  private final EntityDeletionOrUpdateAdapter<Subscriber> __deletionAdapterOfSubscriber;

  private final EntityDeletionOrUpdateAdapter<Subscriber> __updateAdapterOfSubscriber;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SubscriberDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubscriber = new EntityInsertionAdapter<Subscriber>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `vpm_room` (`subscriber_id`,`subscriber_name`,`subscriber_Date`,`subscriber_isLive`,`sub_isLiveBoolean`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscriber value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.isLive() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.isLive());
        }
        if (value.isLiveBoolean() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.isLiveBoolean());
        }
      }
    };
    this.__deletionAdapterOfSubscriber = new EntityDeletionOrUpdateAdapter<Subscriber>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `vpm_room` WHERE `subscriber_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscriber value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfSubscriber = new EntityDeletionOrUpdateAdapter<Subscriber>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `vpm_room` SET `subscriber_id` = ?,`subscriber_name` = ?,`subscriber_Date` = ?,`subscriber_isLive` = ?,`sub_isLiveBoolean` = ? WHERE `subscriber_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscriber value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.isLive() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.isLive());
        }
        if (value.isLiveBoolean() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.isLiveBoolean());
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM vpm_room";
        return _query;
      }
    };
  }

  @Override
  public Object insertSubscriber(final Subscriber subscriber,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSubscriber.insert(subscriber);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteSubscriber(final Subscriber subscriber,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSubscriber.handle(subscriber);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateSubscriber(final Subscriber subscriber,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSubscriber.handle(subscriber);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Subscriber>> getAllSubscribers() {
    final String _sql = "SELECT * FROM vpm_room ORDER BY subscriber_isLive DESC ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"vpm_room"}, false, new Callable<List<Subscriber>>() {
      @Override
      public List<Subscriber> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriber_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriber_name");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriber_Date");
          final int _cursorIndexOfIsLive = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriber_isLive");
          final int _cursorIndexOfIsLiveBoolean = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_isLiveBoolean");
          final List<Subscriber> _result = new ArrayList<Subscriber>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Subscriber _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpIsLive;
            if (_cursor.isNull(_cursorIndexOfIsLive)) {
              _tmpIsLive = null;
            } else {
              _tmpIsLive = _cursor.getString(_cursorIndexOfIsLive);
            }
            final String _tmpIsLiveBoolean;
            if (_cursor.isNull(_cursorIndexOfIsLiveBoolean)) {
              _tmpIsLiveBoolean = null;
            } else {
              _tmpIsLiveBoolean = _cursor.getString(_cursorIndexOfIsLiveBoolean);
            }
            _item = new Subscriber(_tmpId,_tmpName,_tmpDate,_tmpIsLive,_tmpIsLiveBoolean);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
