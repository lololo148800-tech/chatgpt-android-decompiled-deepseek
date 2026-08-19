package ie;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.AbstractC16544l;
import p110E4.C2314l;
import p233J4.C4256b;

/* JADX INFO: renamed from: ie.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14974c extends C2314l {
    @Override // p110E4.C2314l, p031B3.AbstractC0797a
    /* JADX INFO: renamed from: j */
    public final void mo1828j(C4256b c4256b) {
        SQLiteDatabase sQLiteDatabase = c4256b.f13904Y;
        AbstractC16544l.m18094g(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        c4256b.f13904Y.enableWriteAheadLogging();
    }
}
