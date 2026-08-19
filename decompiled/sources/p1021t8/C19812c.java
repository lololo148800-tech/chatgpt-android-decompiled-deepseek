package p1021t8;

import android.gov.nist.core.Separators;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p062C8.C1614b;
import p1059v8.C20477a;
import p1077w8.C20849a;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p765g7.InterfaceC13823a;
import p849k7.C16360m;
import p885m4.C17155e;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: t8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19812c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13823a f62851a;

    /* JADX INFO: renamed from: b */
    public final C17155e f62852b;

    /* JADX INFO: renamed from: c */
    public Set f62853c;

    /* JADX INFO: renamed from: d */
    public boolean f62854d;

    /* JADX INFO: renamed from: e */
    public double f62855e;

    /* JADX INFO: renamed from: f */
    public final String f62856f;

    /* JADX INFO: renamed from: g */
    public final int f62857g;

    /* JADX INFO: renamed from: h */
    public final SecureRandom f62858h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f62859i;

    public C19812c(InterfaceC13823a sdkCore) {
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        C17155e c17155e = new C17155e();
        this.f62851a = sdkCore;
        this.f62852b = c17155e;
        this.f62853c = AbstractC17678l.m19293P(new EnumC19815f[]{EnumC19815f.f62864Y, EnumC19815f.f62867p0});
        this.f62854d = true;
        this.f62855e = 100.0d;
        this.f62856f = "";
        this.f62857g = 5;
        this.f62858h = new SecureRandom();
        this.f62859i = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final C19813d m20768a() {
        InterfaceC13823a interfaceC13823a = this.f62851a;
        C16360m c16360mMo15458n = interfaceC13823a.mo15458n("tracing");
        C20477a c20477a = c16360mMo15458n != null ? (C20477a) c16360mMo15458n.f50808b : null;
        C16360m c16360mMo15458n2 = interfaceC13823a.mo15458n("rum");
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (c20477a == null) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 5, enumC11255b, C19811b.f62847Z, null, false, 56);
        }
        if (this.f62854d && c16360mMo15458n2 == null) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, C19811b.f62848o0, null, false, 56);
            this.f62854d = false;
        }
        Properties properties = new Properties();
        String str = this.f62856f;
        if (str.length() == 0) {
            String strMo15456l = interfaceC13823a.mo15456l();
            if (strMo15456l.length() == 0) {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 5, enumC11255b, C19811b.f62849p0, null, false, 56);
            }
            str = strMo15456l;
        }
        properties.setProperty("service.name", str);
        properties.setProperty("trace.partial.flush.min.spans", String.valueOf(this.f62857g));
        LinkedHashMap linkedHashMap = this.f62859i;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(entry.getKey() + ":" + entry.getValue());
        }
        properties.setProperty("tags", AbstractC17680n.m19349Y(arrayList, Separators.COMMA, null, null, 0, null, null, 62));
        properties.setProperty("trace.sample.rate", String.valueOf(this.f62855e / 100.0d));
        String strM19349Y = AbstractC17680n.m19349Y(this.f62853c, Separators.COMMA, null, null, 0, null, null, 62);
        properties.setProperty("propagation.style.extract", strM19349Y);
        properties.setProperty("propagation.style.inject", strM19349Y);
        C1614b c1614b = C1614b.f4500v0;
        C1614b c1614b2 = properties.isEmpty() ? c1614b : new C1614b(properties, c1614b);
        AbstractC16544l.m18093f(c1614b2, "get(properties())");
        return new C19813d(this.f62851a, c1614b2, c20477a != null ? c20477a.f65002o0 : new C20849a(), this.f62858h, this.f62852b, this.f62854d);
    }
}
