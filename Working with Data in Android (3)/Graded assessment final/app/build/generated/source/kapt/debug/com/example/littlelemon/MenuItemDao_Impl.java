package com.example.littlelemon;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MenuItemDao_Impl implements MenuItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MenuItemRoom> __insertionAdapterOfMenuItemRoom;

  public MenuItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMenuItemRoom = new EntityInsertionAdapter<MenuItemRoom>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `MenuItemRoom` (`id`,`title`,`price`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MenuItemRoom value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindDouble(3, value.getPrice());
      }
    };
  }

  @Override
  public void insertAll(final MenuItemRoom... menuItems) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMenuItemRoom.insert(menuItems);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<MenuItemRoom>> getAll() {
    final String _sql = "SELECT * FROM MenuItemRoom";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"MenuItemRoom"}, false, new Callable<List<MenuItemRoom>>() {
      @Override
      public List<MenuItemRoom> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final List<MenuItemRoom> _result = new ArrayList<MenuItemRoom>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MenuItemRoom _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            _item = new MenuItemRoom(_tmpId,_tmpTitle,_tmpPrice);
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

  @Override
  public boolean isEmpty() {
    final String _sql = "SELECT (SELECT COUNT(*) FROM MenuItemRoom) == 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
