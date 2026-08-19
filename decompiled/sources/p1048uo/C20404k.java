package p1048uo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16544l;
import mo.EnumC17357x;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: uo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C20404k extends C20407n {

    /* JADX INFO: renamed from: c */
    public static final boolean f64522c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM21736w = property != null ? AbstractC21329w.m21736w(property) : null;
        boolean z6 = false;
        if (numM21736w == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z6 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM21736w.intValue() >= 9) {
            z6 = true;
        }
        f64522c = z6;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: d */
    public final void mo21051d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((EnumC17357x) obj) != EnumC17357x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC17357x) it.next()).f55378Y);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: f */
    public final String mo21052f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
