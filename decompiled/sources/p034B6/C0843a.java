package p034B6;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p593Y8.C9683j;
import p801i5.AbstractC14929a;
import p801i5.C14932d;
import p801i5.InterfaceC14933e;
import p801i5.InterfaceC14934f;

/* JADX INFO: renamed from: B6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0843a implements InterfaceC14934f {

    /* JADX INFO: renamed from: a */
    public static final C0843a f2349a = new C0843a();

    @Override // p801i5.InterfaceC14934f
    /* JADX INFO: renamed from: a */
    public final InterfaceC14933e mo1904a(C9683j c9683j, long j10, long j11, AbstractC14929a[] callbacks) {
        AbstractC16544l.m18094g(callbacks, "callbacks");
        InterfaceC14933e.f46523a.getClass();
        return new C14932d(C17296C.f55119a);
    }

    @Override // p801i5.InterfaceC14934f
    /* JADX INFO: renamed from: b */
    public final InterfaceC14933e mo1905b(C9683j c9683j) {
        c9683j.m10277e(null, "CREATE TABLE records (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT,\n  key TEXT NOT NULL,\n  record TEXT NOT NULL\n)", null);
        c9683j.m10277e(null, "CREATE INDEX idx_records_key ON records(key)", null);
        InterfaceC14933e.f46523a.getClass();
        return new C14932d(C17296C.f55119a);
    }

    @Override // p801i5.InterfaceC14934f
    public final long getVersion() {
        return 1L;
    }
}
