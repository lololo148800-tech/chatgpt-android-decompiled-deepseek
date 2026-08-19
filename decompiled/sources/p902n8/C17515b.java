package p902n8;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21328v;
import p1113xn.C21307a;
import p523V9.AbstractC8206u4;
import p661b7.InterfaceC11256c;

/* JADX INFO: renamed from: n8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17515b implements InterfaceC17525l {

    /* JADX INFO: renamed from: c */
    public static final File f56016c = new File("/proc/self/stat");

    /* JADX INFO: renamed from: a */
    public final File f56017a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11256c f56018b;

    public C17515b(InterfaceC11256c internalLogger) {
        File statFile = f56016c;
        AbstractC16544l.m18094g(statFile, "statFile");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f56017a = statFile;
        this.f56018b = internalLogger;
    }

    @Override // p902n8.InterfaceC17525l
    /* JADX INFO: renamed from: a */
    public final Double mo19205a() {
        String strM8828j;
        File file = this.f56017a;
        InterfaceC11256c interfaceC11256c = this.f56018b;
        if (!AbstractC8206u4.m8824f(file, interfaceC11256c) || !AbstractC8206u4.m8822d(file, interfaceC11256c) || (strM8828j = AbstractC8206u4.m8828j(file, C21307a.f67720a, interfaceC11256c)) == null) {
            return null;
        }
        List listM21696d0 = AbstractC21322p.m21696d0(strM8828j, new char[]{' '}, 6);
        if (listM21696d0.size() > 13) {
            return AbstractC21328v.m21719f((String) listM21696d0.get(13));
        }
        return null;
    }
}
