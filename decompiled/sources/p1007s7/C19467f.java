package p1007s7;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p080D0.C1832u;
import p1020t7.C19807e;
import p1020t7.C19809g;
import p1058v7.C20476h;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p743f7.C13579e;
import p743f7.InterfaceC13576b;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: s7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C19467f implements InterfaceC13576b {

    /* JADX INFO: renamed from: a */
    public final File f61779a;

    /* JADX INFO: renamed from: b */
    public final C20476h f61780b;

    /* JADX INFO: renamed from: c */
    public final C19807e f61781c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC11256c f61782d;

    public C19467f(File file, File file2, C20476h c20476h, C19809g c19809g, C19807e c19807e, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f61779a = file;
        this.f61780b = c20476h;
        this.f61781c = c19807e;
        this.f61782d = internalLogger;
    }

    @Override // p743f7.InterfaceC13576b
    /* JADX INFO: renamed from: a */
    public final boolean mo15101a(C13579e c13579e, int i10) {
        AbstractC14376f.m15825D(i10, "eventType");
        byte[] bArr = c13579e.f42929a;
        if (bArr.length == 0) {
            return true;
        }
        int length = bArr.length;
        long j10 = length;
        long j11 = this.f61781c.f62839c;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (j10 > j11) {
            AbstractC7889G0.m8184b(this.f61782d, 5, enumC11255b, new C1832u(length, this, 4), null, false, 56);
        } else if (this.f61780b.mo20764a(this.f61779a, c13579e, true)) {
            return true;
        }
        return false;
    }
}
