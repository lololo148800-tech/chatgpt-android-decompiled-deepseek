package p902n8;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1020t7.C19804b;
import p1113xn.AbstractC21328v;
import p1113xn.C21307a;
import p1113xn.C21317k;
import p1113xn.C21319m;
import p523V9.AbstractC8206u4;
import p661b7.InterfaceC11256c;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: n8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17521h implements InterfaceC17525l {

    /* JADX INFO: renamed from: c */
    public static final File f56043c = new File("/proc/self/status");

    /* JADX INFO: renamed from: d */
    public static final C21319m f56044d = new C21319m("VmRSS:\\s+(\\d+) kB");

    /* JADX INFO: renamed from: a */
    public final File f56045a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11256c f56046b;

    public C17521h(InterfaceC11256c internalLogger) {
        File statusFile = f56043c;
        AbstractC16544l.m18094g(statusFile, "statusFile");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f56045a = statusFile;
        this.f56046b = internalLogger;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    @Override // p902n8.InterfaceC17525l
    /* JADX INFO: renamed from: a */
    public final Double mo19205a() {
        Double dM21719f;
        File file = this.f56045a;
        InterfaceC11256c interfaceC11256c = this.f56046b;
        if (!AbstractC8206u4.m8824f(file, interfaceC11256c) || !AbstractC8206u4.m8822d(file, interfaceC11256c)) {
            return null;
        }
        Charset charset = C21307a.f67720a;
        AbstractC16544l.m18094g(charset, "charset");
        List list = (AbstractC8206u4.m8824f(file, interfaceC11256c) && AbstractC8206u4.m8822d(file, interfaceC11256c)) ? (List) AbstractC8206u4.m8829k(file, null, interfaceC11256c, new C19804b(0, charset)) : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C21317k c21317kM21663c = f56044d.m21663c((String) it.next());
                String str = c21317kM21663c != null ? (String) AbstractC17680n.m19344T(1, c21317kM21663c.m21657a()) : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String str2 = (String) AbstractC17680n.m19343S(arrayList);
            if (str2 != null) {
                dM21719f = AbstractC21328v.m21719f(str2);
            } else {
                dM21719f = null;
            }
        } else {
            dM21719f = null;
        }
        if (dM21719f == null) {
            return null;
        }
        return Double.valueOf(dM21719f.doubleValue() * ((double) 1000));
    }
}
