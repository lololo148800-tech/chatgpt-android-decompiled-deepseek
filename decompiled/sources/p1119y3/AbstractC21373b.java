package p1119y3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import p1016t3.AbstractC19798y;
import p1073w3.AbstractC20817s;
import p232J3.C4206F;

/* JADX INFO: renamed from: y3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21373b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f67848a = 0;

    static {
        AbstractC19798y.m20754a("media3.database");
    }

    /* JADX INFO: renamed from: a */
    public static int m21757a(SQLiteDatabase sQLiteDatabase, int i10, String str) throws C4206F {
        try {
            int i11 = AbstractC20817s.f66106a;
            if (!(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0)) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i10), str}, null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i12 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i12;
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
            throw new C4206F(e);
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21758b(SQLiteDatabase sQLiteDatabase, int i10, String str) throws C4206F {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }
}
