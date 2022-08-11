package com.demo.dagger2demo_kotlin.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SubscriberDatabase_Impl extends SubscriberDatabase {
  private volatile SubscriberDAO _subscriberDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `vpm_room` (`subscriber_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `subscriber_name` TEXT NOT NULL, `subscriber_Date` TEXT NOT NULL, `subscriber_isLive` TEXT NOT NULL, `sub_isLiveBoolean` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cae150929bc2c6764a785d26ef8fe319')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `vpm_room`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsVpmRoom = new HashMap<String, TableInfo.Column>(5);
        _columnsVpmRoom.put("subscriber_id", new TableInfo.Column("subscriber_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVpmRoom.put("subscriber_name", new TableInfo.Column("subscriber_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVpmRoom.put("subscriber_Date", new TableInfo.Column("subscriber_Date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVpmRoom.put("subscriber_isLive", new TableInfo.Column("subscriber_isLive", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVpmRoom.put("sub_isLiveBoolean", new TableInfo.Column("sub_isLiveBoolean", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVpmRoom = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVpmRoom = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVpmRoom = new TableInfo("vpm_room", _columnsVpmRoom, _foreignKeysVpmRoom, _indicesVpmRoom);
        final TableInfo _existingVpmRoom = TableInfo.read(_db, "vpm_room");
        if (! _infoVpmRoom.equals(_existingVpmRoom)) {
          return new RoomOpenHelper.ValidationResult(false, "vpm_room(com.demo.dagger2demo_kotlin.db.Subscriber).\n"
                  + " Expected:\n" + _infoVpmRoom + "\n"
                  + " Found:\n" + _existingVpmRoom);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "cae150929bc2c6764a785d26ef8fe319", "0e74dcab67a4c8f6e08f5c63cbedb5b8");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "vpm_room");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `vpm_room`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SubscriberDAO.class, SubscriberDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public SubscriberDAO getSubscriberDAO() {
    if (_subscriberDAO != null) {
      return _subscriberDAO;
    } else {
      synchronized(this) {
        if(_subscriberDAO == null) {
          _subscriberDAO = new SubscriberDAO_Impl(this);
        }
        return _subscriberDAO;
      }
    }
  }
}
