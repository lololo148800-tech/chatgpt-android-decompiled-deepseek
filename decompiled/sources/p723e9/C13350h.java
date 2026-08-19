package p723e9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p001A.C0100z;
import p158G3.C2988g;
import p239Ja.C4307j;
import p301M.C5226h;
import p522V8.C7836c;
import p523V9.AbstractC8158o4;
import p543W8.C8440a;
import p543W8.C8441b;
import p543W8.C8442c;
import p570X8.C9080h;
import p570X8.C9081i;
import p570X8.C9082j;
import p570X8.C9083k;
import p570X8.C9084l;
import p570X8.C9086n;
import p570X8.EnumC9092t;
import p570X8.EnumC9093u;
import p570X8.EnumC9095w;
import p593Y8.AbstractC9688o;
import p593Y8.C9681h;
import p593Y8.C9682i;
import p593Y8.C9685l;
import p615Z6.C10252z0;
import p616Z8.C10253a;
import p616Z8.C10258f;
import p616Z8.InterfaceC10260h;
import p658b5.C11242m;
import p663b9.C11262a;
import p745f9.C13584b;
import p745f9.C13589g;
import p745f9.InterfaceC13585c;
import p745f9.InterfaceC13586d;
import p767g9.InterfaceC13831b;
import p767g9.InterfaceC13832c;
import p782h9.InterfaceC14430a;
import p817j$.util.Objects;
import p999s.C19341c1;

/* JADX INFO: renamed from: e9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13350h {

    /* JADX INFO: renamed from: a */
    public final Context f42352a;

    /* JADX INFO: renamed from: b */
    public final C10258f f42353b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13586d f42354c;

    /* JADX INFO: renamed from: d */
    public final C13345c f42355d;

    /* JADX INFO: renamed from: e */
    public final Executor f42356e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC13832c f42357f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC14430a f42358g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC14430a f42359h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC13585c f42360i;

    public C13350h(Context context, C10258f c10258f, InterfaceC13586d interfaceC13586d, C13345c c13345c, Executor executor, InterfaceC13832c interfaceC13832c, InterfaceC14430a interfaceC14430a, InterfaceC14430a interfaceC14430a2, InterfaceC13585c interfaceC13585c) {
        this.f42352a = context;
        this.f42353b = c10258f;
        this.f42354c = interfaceC13586d;
        this.f42355d = c13345c;
        this.f42356e = executor;
        this.f42357f = interfaceC13832c;
        this.f42358g = interfaceC14430a;
        this.f42359h = interfaceC14430a2;
        this.f42360i = interfaceC13585c;
    }

    /* JADX INFO: renamed from: a */
    public final void m14940a(C9682i c9682i, int i10) {
        InterfaceC10260h interfaceC10260h;
        C10253a c10253a;
        String str;
        C10253a c10253a2;
        int i11;
        C2988g c2988gM5057h;
        String str2;
        Integer numValueOf;
        String str3;
        C19341c1 c19341c1;
        int i12;
        final C13350h c13350h = this;
        final C9682i c9682i2 = c9682i;
        final int i13 = 1;
        final int i14 = 0;
        InterfaceC10260h interfaceC10260hM10859a = c13350h.f42353b.m10859a(c9682i2.f29188a);
        long jMax = 0;
        while (true) {
            InterfaceC13831b interfaceC13831b = new InterfaceC13831b(c13350h) { // from class: e9.f

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C13350h f42345Z;

                {
                    this.f42345Z = c13350h;
                }

                @Override // p767g9.InterfaceC13831b
                /* JADX INFO: renamed from: a */
                public final Object mo197a() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            C9682i c9682i3 = c9682i2;
                            C13589g c13589g = (C13589g) this.f42345Z.f42354c;
                            SQLiteDatabase sQLiteDatabaseM15109a = c13589g.m15109a();
                            sQLiteDatabaseM15109a.beginTransaction();
                            try {
                                Long lM15106e = C13589g.m15106e(sQLiteDatabaseM15109a, c9682i3);
                                if (lM15106e == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c13589g.m15109a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM15106e.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseM15109a.setTransactionSuccessful();
                                sQLiteDatabaseM15109a.endTransaction();
                                return bool;
                            } catch (Throwable th3) {
                                sQLiteDatabaseM15109a.endTransaction();
                                throw th3;
                            }
                        default:
                            C13589g c13589g2 = (C13589g) this.f42345Z.f42354c;
                            c13589g2.getClass();
                            return (Iterable) c13589g2.m15110k(new C0100z(c13589g2, 27, c9682i2));
                    }
                }
            };
            C13589g c13589g = (C13589g) c13350h.f42357f;
            if (!((Boolean) c13589g.m15108P(interfaceC13831b)).booleanValue()) {
                c13589g.m15108P(new C5226h(this, c9682i, jMax, 2));
                return;
            }
            Iterable iterable = (Iterable) c13589g.m15108P(new InterfaceC13831b(c13350h) { // from class: e9.f

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C13350h f42345Z;

                {
                    this.f42345Z = c13350h;
                }

                @Override // p767g9.InterfaceC13831b
                /* JADX INFO: renamed from: a */
                public final Object mo197a() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            C9682i c9682i3 = c9682i2;
                            C13589g c13589g2 = (C13589g) this.f42345Z.f42354c;
                            SQLiteDatabase sQLiteDatabaseM15109a = c13589g2.m15109a();
                            sQLiteDatabaseM15109a.beginTransaction();
                            try {
                                Long lM15106e = C13589g.m15106e(sQLiteDatabaseM15109a, c9682i3);
                                if (lM15106e == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c13589g2.m15109a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM15106e.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseM15109a.setTransactionSuccessful();
                                sQLiteDatabaseM15109a.endTransaction();
                                return bool;
                            } catch (Throwable th3) {
                                sQLiteDatabaseM15109a.endTransaction();
                                throw th3;
                            }
                        default:
                            C13589g c13589g3 = (C13589g) this.f42345Z.f42354c;
                            c13589g3.getClass();
                            return (Iterable) c13589g3.m15110k(new C0100z(c13589g3, 27, c9682i2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = c9682i2.f29189b;
            if (interfaceC10260hM10859a == null) {
                AbstractC8158o4.m8716a(c9682i2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                c10253a2 = new C10253a(3, -1L);
                interfaceC10260h = interfaceC10260hM10859a;
            } else {
                ArrayList<C9681h> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C13584b) it.next()).f42946c);
                }
                String str4 = "proto";
                if ((bArr != null ? i13 : i14) != 0) {
                    InterfaceC13585c interfaceC13585c = c13350h.f42360i;
                    Objects.requireNonNull(interfaceC13585c);
                    C11262a c11262a = (C11262a) c13589g.m15108P(new C4307j(interfaceC13585c, 16));
                    C10252z0 c10252z0 = new C10252z0();
                    c10252z0.f30459r0 = new HashMap();
                    c10252z0.f30457p0 = Long.valueOf(c13350h.f42358g.getTime());
                    c10252z0.f30458q0 = Long.valueOf(c13350h.f42359h.getTime());
                    c10252z0.f30454Y = "GDT_CLIENT_METRICS";
                    C7836c c7836c = new C7836c("proto");
                    c11262a.getClass();
                    C11242m c11242m = AbstractC9688o.f29202a;
                    c11242m.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c11242m.m12619x(c11262a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c10252z0.f30456o0 = new C9685l(c7836c, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C8442c) interfaceC10260hM10859a).m9044a(c10252z0.m10846f()));
                }
                C8442c c8442c = (C8442c) interfaceC10260hM10859a;
                HashMap map = new HashMap();
                for (C9681h c9681h : arrayList) {
                    String str5 = c9681h.f29182a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(c9681h);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c9681h);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    C9681h c9681h2 = (C9681h) ((List) entry.getValue()).get(0);
                    EnumC9095w enumC9095w = EnumC9095w.f27860Y;
                    long time = c8442c.f26289f.getTime();
                    long time2 = c8442c.f26288e.getTime();
                    C9082j c9082j = new C9082j(new C9080h(Integer.valueOf(c9681h2.m10268b("sdk-version")), c9681h2.m10267a("model"), c9681h2.m10267a("hardware"), c9681h2.m10267a("device"), c9681h2.m10267a("product"), c9681h2.m10267a("os-uild"), c9681h2.m10267a("manufacturer"), c9681h2.m10267a("fingerprint"), c9681h2.m10267a("locale"), c9681h2.m10267a("country"), c9681h2.m10267a("mcc_mnc"), c9681h2.m10267a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = ((List) entry.getValue()).iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = it2;
                        C9681h c9681h3 = (C9681h) it3.next();
                        InterfaceC10260h interfaceC10260h2 = interfaceC10260hM10859a;
                        C9685l c9685l = c9681h3.f29184c;
                        Iterator it5 = it3;
                        C7836c c7836c2 = c9685l.f29198a;
                        boolean zEquals = c7836c2.equals(new C7836c(str4));
                        byte[] bArr2 = c9685l.f29199b;
                        if (zEquals) {
                            c19341c1 = new C19341c1();
                            c19341c1.f61257p0 = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (c7836c2.equals(new C7836c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                C19341c1 c19341c2 = new C19341c1();
                                c19341c2.f61258q0 = str6;
                                c19341c1 = c19341c2;
                            } else {
                                String strM8719d = AbstractC8158o4.m8719d("CctTransportBackend");
                                if (Log.isLoggable(strM8719d, 5)) {
                                    AbstractC15256t.m16482t(strM8719d, "Received event of unsupported encoding " + c7836c2 + ". Skipping...");
                                }
                            }
                            it3 = it5;
                            it2 = it4;
                            interfaceC10260hM10859a = interfaceC10260h2;
                            str4 = str3;
                        }
                        c19341c1.f61254Y = Long.valueOf(c9681h3.f29185d);
                        c19341c1.f61256o0 = Long.valueOf(c9681h3.f29186e);
                        String str7 = (String) c9681h3.f29187f.get("tz-offset");
                        c19341c1.f61259r0 = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        c19341c1.f61260s0 = new C9086n((EnumC9093u) EnumC9093u.f27858Y.get(c9681h3.m10268b("net-type")), (EnumC9092t) EnumC9092t.f27856Y.get(c9681h3.m10268b("mobile-subtype")));
                        Integer num = c9681h3.f29183b;
                        if (num != null) {
                            c19341c1.f61255Z = num;
                        }
                        String strM11052j = ((Long) c19341c1.f61254Y) == null ? " eventTimeMs" : "";
                        if (((Long) c19341c1.f61256o0) == null) {
                            strM11052j = strM11052j.concat(" eventUptimeMs");
                        }
                        if (((Long) c19341c1.f61259r0) == null) {
                            strM11052j = AbstractC10763a.m11052j(strM11052j, " timezoneOffsetSeconds");
                        }
                        if (!strM11052j.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strM11052j));
                        }
                        arrayList4.add(new C9083k(((Long) c19341c1.f61254Y).longValue(), (Integer) c19341c1.f61255Z, ((Long) c19341c1.f61256o0).longValue(), (byte[]) c19341c1.f61257p0, (String) c19341c1.f61258q0, ((Long) c19341c1.f61259r0).longValue(), (C9086n) c19341c1.f61260s0));
                        it3 = it5;
                        it2 = it4;
                        interfaceC10260hM10859a = interfaceC10260h2;
                        str4 = str3;
                    }
                    arrayList3.add(new C9084l(time, time2, c9082j, numValueOf, str2, arrayList4));
                    it2 = it2;
                    interfaceC10260hM10859a = interfaceC10260hM10859a;
                    str4 = str4;
                }
                interfaceC10260h = interfaceC10260hM10859a;
                C9081i c9081i = new C9081i(arrayList3);
                URL urlM9043b = c8442c.f26287d;
                if (bArr != null) {
                    try {
                        C8440a c8440aM9042a = C8440a.m9042a(bArr);
                        str = c8440aM9042a.f26280b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = c8440aM9042a.f26279a;
                        if (str8 != null) {
                            urlM9043b = C8442c.m9043b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c10253a = new C10253a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    C8441b c8441b = new C8441b(urlM9043b, c9081i, str);
                    C4307j c4307j = new C4307j(c8442c, 11);
                    int i15 = 5;
                    do {
                        c2988gM5057h = c4307j.m5057h(c8441b);
                        URL url = (URL) c2988gM5057h.f8972c;
                        if (url != null) {
                            AbstractC8158o4.m8716a(url, "CctTransportBackend", "Following redirect to: %s");
                            c8441b = new C8441b(url, c8441b.f26282b, c8441b.f26283c);
                        } else {
                            c8441b = null;
                        }
                        if (c8441b == null) {
                            break;
                        } else {
                            i15--;
                        }
                    } while (i15 >= 1);
                    int i16 = c2988gM5057h.f8970a;
                    if (i16 == 200) {
                        c10253a2 = new C10253a(1, c2988gM5057h.f8971b);
                    } else {
                        if (i16 >= 500 || i16 == 404) {
                            c10253a = new C10253a(2, -1L);
                        } else if (i16 == 400) {
                            try {
                                c10253a = new C10253a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                AbstractC8158o4.m8718c("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                c10253a2 = new C10253a(2, -1L);
                            }
                        } else {
                            c10253a = new C10253a(3, -1L);
                        }
                        c10253a2 = c10253a;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i11 = 2;
            int i17 = c10253a2.f30460a;
            if (i17 == i11) {
                c13589g.m15108P(new C13349g(this, iterable, c9682i, jMax));
                this.f42355d.m14938a(c9682i, i10 + 1, true);
                return;
            }
            c13350h = this;
            c13589g.m15108P(new C0100z(c13350h, 25, iterable));
            if (i17 == 1) {
                jMax = Math.max(jMax, c10253a2.f30461b);
                if (bArr != null) {
                    c13589g.m15108P(new C4307j(c13350h, 18));
                }
            } else {
                if (i17 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it6 = iterable.iterator();
                    while (it6.hasNext()) {
                        String str9 = ((C13584b) it6.next()).f42946c.f29182a;
                        if (map2.containsKey(str9)) {
                            map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                        } else {
                            map2.put(str9, 1);
                        }
                    }
                    i12 = 1;
                    c13589g.m15108P(new C0100z(c13350h, 26, map2));
                }
                c9682i2 = c9682i;
                i13 = i12;
                interfaceC10260hM10859a = interfaceC10260h;
                i14 = 0;
            }
            i12 = 1;
            c9682i2 = c9682i;
            i13 = i12;
            interfaceC10260hM10859a = interfaceC10260h;
            i14 = 0;
        }
    }
}
