package p233J4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0485p;
import p207I4.InterfaceC3619f;

/* JADX INFO: renamed from: J4.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4255a implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13901b;

    public /* synthetic */ C4255a(Object obj, int i10) {
        this.f13900a = i10;
        this.f13901b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f13900a) {
            case 0:
                InterfaceC3619f interfaceC3619f = (InterfaceC3619f) this.f13901b;
                AbstractC16544l.m18091d(sQLiteQuery);
                interfaceC3619f.mo3423e(new C4261g(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return (Cursor) ((C0485p) this.f13901b).mo985d(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
