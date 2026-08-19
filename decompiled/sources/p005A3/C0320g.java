package p005A3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p1119y3.AbstractC21373b;
import p1119y3.C21372a;
import p232J3.C4206F;

/* JADX INFO: renamed from: A3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0320g {

    /* JADX INFO: renamed from: c */
    public static final String[] f1117c = {DiagnosticsEntry.NAME_KEY, "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a */
    public final Object f1118a;

    /* JADX INFO: renamed from: b */
    public Serializable f1119b;

    public C0320g() {
        this.f1118a = new HashMap();
        this.f1119b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public void m931a(Object obj, String str) {
        HashMap map = (HashMap) this.f1118a;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f1119b).remove(str);
    }

    /* JADX INFO: renamed from: b */
    public HashMap m932b() throws C4206F {
        try {
            ((String) this.f1119b).getClass();
            Cursor cursorQuery = ((C21372a) this.f1118a).getReadableDatabase().query((String) this.f1119b, f1117c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C0319f(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m933c(long j10) throws C4206F {
        C21372a c21372a = (C21372a) this.f1118a;
        try {
            String hexString = Long.toHexString(j10);
            this.f1119b = "ExoPlayerCacheFileMetadata" + hexString;
            if (AbstractC21373b.m21757a(c21372a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c21372a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC21373b.m21758b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f1119b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f1119b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m934d(Set set) throws C4206F {
        ((String) this.f1119b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C21372a) this.f1118a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f1119b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m935e(long j10, long j11, String str) throws C4206F {
        ((String) this.f1119b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C21372a) this.f1118a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(DiagnosticsEntry.NAME_KEY, str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow((String) this.f1119b, null, contentValues);
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    public C0320g(C21372a c21372a) {
        this.f1118a = c21372a;
    }
}
