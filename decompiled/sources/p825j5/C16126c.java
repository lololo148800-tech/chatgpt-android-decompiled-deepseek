package p825j5;

import android.database.Cursor;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p069Cf.C1650i;
import p207I4.InterfaceC3618e;
import p207I4.InterfaceC3619f;
import p233J4.C4256b;
import p523V9.AbstractC7942M5;
import p801i5.InterfaceC14933e;

/* JADX INFO: renamed from: j5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16126c implements InterfaceC3619f, InterfaceC16130g {

    /* JADX INFO: renamed from: Y */
    public final String f50037Y;

    /* JADX INFO: renamed from: Z */
    public final C4256b f50038Z;

    /* JADX INFO: renamed from: o0 */
    public final Long f50039o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f50040p0;

    public C16126c(String sql, C4256b database, int i10, Long l4) {
        AbstractC16544l.m18094g(sql, "sql");
        AbstractC16544l.m18094g(database, "database");
        this.f50037Y = sql;
        this.f50038Z = database;
        this.f50039o0 = l4;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(null);
        }
        this.f50040p0 = arrayList;
    }

    @Override // p825j5.InterfaceC16130g
    /* JADX INFO: renamed from: a */
    public final long mo17680a() {
        throw new UnsupportedOperationException();
    }

    @Override // p825j5.InterfaceC16130g
    /* JADX INFO: renamed from: b */
    public final Object mo17681b(InterfaceC1436k interfaceC1436k) {
        Cursor cursorM5022W = this.f50038Z.m5022W(this);
        try {
            Object value = ((InterfaceC14933e) interfaceC1436k.invoke(new C16124a(cursorM5022W, this.f50039o0))).getValue();
            AbstractC7942M5.m8232a(cursorM5022W, null);
            return value;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(cursorM5022W, th2);
                throw th3;
            }
        }
    }

    @Override // p825j5.InterfaceC16130g
    /* JADX INFO: renamed from: c */
    public final void mo17682c(int i10, String str) {
        this.f50040p0.set(i10, new C1650i(str, i10, 5));
    }

    @Override // p207I4.InterfaceC3619f
    /* JADX INFO: renamed from: e */
    public final void mo3423e(InterfaceC3618e interfaceC3618e) {
        for (InterfaceC1436k interfaceC1436k : this.f50040p0) {
            AbstractC16544l.m18091d(interfaceC1436k);
            interfaceC1436k.invoke(interfaceC3618e);
        }
    }

    @Override // p207I4.InterfaceC3619f
    /* JADX INFO: renamed from: k */
    public final String mo3424k() {
        return this.f50037Y;
    }

    public final String toString() {
        return this.f50037Y;
    }

    @Override // p825j5.InterfaceC16130g
    public final void close() {
    }
}
