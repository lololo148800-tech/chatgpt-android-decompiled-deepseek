package p005A3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.SparseArray;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p001A.C0017I0;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1119y3.AbstractC21373b;
import p1119y3.C21372a;
import p232J3.C4206F;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0325l implements InterfaceC0327n {

    /* JADX INFO: renamed from: e */
    public static final String[] f1134e = {ParameterNames.f31999ID, SubscriberAttributeKt.JSON_NAME_KEY, "metadata"};

    /* JADX INFO: renamed from: a */
    public final C21372a f1135a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f1136b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public String f1137c;

    /* JADX INFO: renamed from: d */
    public String f1138d;

    public C0325l(C21372a c21372a) {
        this.f1135a = c21372a;
    }

    /* JADX INFO: renamed from: a */
    public final void m938a(SQLiteDatabase sQLiteDatabase, C0324k c0324k) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0017I0.m57b(c0324k.f1133e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ParameterNames.f31999ID, Integer.valueOf(c0324k.f1129a));
        contentValues.put(SubscriberAttributeKt.JSON_NAME_KEY, c0324k.f1130b);
        contentValues.put("metadata", byteArray);
        String str = this.f1138d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    /* JADX INFO: renamed from: b */
    public final void m939b(SQLiteDatabase sQLiteDatabase) throws C4206F {
        String str = this.f1137c;
        str.getClass();
        AbstractC21373b.m21758b(sQLiteDatabase, 1, str);
        String str2 = this.f1138d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f1138d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: d */
    public final void mo940d(C0324k c0324k, boolean z6) {
        SparseArray sparseArray = this.f1136b;
        int i10 = c0324k.f1129a;
        if (z6) {
            sparseArray.delete(i10);
        } else {
            sparseArray.put(i10, null);
        }
    }

    @Override // p005A3.InterfaceC0327n
    public final void delete() throws C4206F {
        C21372a c21372a = this.f1135a;
        String str = this.f1137c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = c21372a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i10 = AbstractC21373b.f67848a;
                try {
                    int i11 = AbstractC20817s.f66106a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e10) {
                    throw new C4206F(e10);
                }
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e11) {
            throw new C4206F(e11);
        }
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: f */
    public final void mo941f(C0324k c0324k) {
        this.f1136b.put(c0324k.f1129a, c0324k);
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: g */
    public final void mo942g(HashMap map) throws C4206F {
        try {
            SQLiteDatabase writableDatabase = this.f1135a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                m939b(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    m938a(writableDatabase, (C0324k) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f1136b.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: i */
    public final boolean mo943i() throws C4206F {
        try {
            SQLiteDatabase readableDatabase = this.f1135a.getReadableDatabase();
            String str = this.f1137c;
            str.getClass();
            return AbstractC21373b.m21757a(readableDatabase, 1, str) != -1;
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: j */
    public final void mo944j(HashMap map) throws C4206F {
        SparseArray sparseArray = this.f1136b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f1135a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                try {
                    C0324k c0324k = (C0324k) sparseArray.valueAt(i10);
                    if (c0324k == null) {
                        int iKeyAt = sparseArray.keyAt(i10);
                        String str = this.f1138d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        m938a(writableDatabase, c0324k);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new C4206F(e10);
        }
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: k */
    public final void mo945k(long j10) {
        String hexString = Long.toHexString(j10);
        this.f1137c = hexString;
        this.f1138d = AbstractC9306j0.m9889h("ExoPlayerCacheIndex", hexString);
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: l */
    public final void mo946l(HashMap map, SparseArray sparseArray) throws C4206F {
        C21372a c21372a = this.f1135a;
        AbstractC20800b.m21320h(this.f1136b.size() == 0);
        try {
            SQLiteDatabase readableDatabase = c21372a.getReadableDatabase();
            String str = this.f1137c;
            str.getClass();
            if (AbstractC21373b.m21757a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c21372a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m939b(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            SQLiteDatabase readableDatabase2 = c21372a.getReadableDatabase();
            String str2 = this.f1138d;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f1134e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i10 = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new C0324k(i10, string, C0017I0.m56a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i10, string);
                } catch (Throwable th3) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e10) {
            map.clear();
            sparseArray.clear();
            throw new C4206F(e10);
        }
    }
}
