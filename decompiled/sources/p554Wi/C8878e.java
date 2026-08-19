package p554Wi;

import ao.C11131E;
import ao.C11181o0;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.C11515c;
import bo.C11524l;
import bo.C11527o;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.ScreenEvent;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p031B3.C0805i;
import p077Cn.C1743k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21323q;
import p523V9.AbstractC8017W3;
import p530Vi.AbstractC8320p;
import p530Vi.C8312h;
import p530Vi.C8322r;
import p594Y9.AbstractC9758K4;
import p594Y9.AbstractC9799R4;
import p626Zi.InterfaceC10398b;
import p646aj.AbstractC10628h;
import p658b5.C11241l;

/* JADX INFO: renamed from: Wi.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C8878e {
    public static final C8874a Companion = new C8874a();

    /* JADX INFO: renamed from: i */
    public static final ScreenEvent f27170i;

    /* JADX INFO: renamed from: a */
    public final C8312h f27171a;

    /* JADX INFO: renamed from: b */
    public final String f27172b;

    /* JADX INFO: renamed from: c */
    public final List f27173c;

    /* JADX INFO: renamed from: d */
    public String f27174d;

    /* JADX INFO: renamed from: e */
    public C1743k f27175e;

    /* JADX INFO: renamed from: f */
    public C1743k f27176f;

    /* JADX INFO: renamed from: g */
    public final C11241l f27177g;

    /* JADX INFO: renamed from: h */
    public boolean f27178h;

    static {
        ScreenEvent screenEvent = new ScreenEvent("#!flush", "#!flush", AbstractC8320p.f25941a);
        screenEvent.f40491e = "#!flush";
        f27170i = screenEvent;
    }

    public C8878e(C8312h c8312h, String logTag, String apiKey, List flushPolicies, String apiHost) {
        AbstractC16544l.m18094g(logTag, "logTag");
        AbstractC16544l.m18094g(apiKey, "apiKey");
        AbstractC16544l.m18094g(flushPolicies, "flushPolicies");
        AbstractC16544l.m18094g(apiHost, "apiHost");
        this.f27171a = c8312h;
        this.f27172b = logTag;
        this.f27173c = flushPolicies;
        this.f27174d = apiHost;
        this.f27177g = new C11241l(apiKey, c8312h.f25902Y.f25929o);
        this.f27178h = false;
        this.f27175e = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
        this.f27176f = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
        Runtime.getRuntime().addShutdownHook(new C0805i(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m9551a(C8878e c8878e, Exception exc, File file) {
        if (exc instanceof C8322r) {
            AbstractC9758K4.m10361b(c8878e.f27171a, c8878e.f27172b + " exception while uploading, " + exc.getMessage());
            int i10 = ((C8322r) exc).f25946Y;
            if (400 <= i10 && i10 < 500 && i10 != 429) {
                AbstractC9799R4.m10419a(C8312h.Companion, "Payloads were rejected by server. Marked for removal.", 1);
                return true;
            }
            AbstractC9799R4.m10419a(C8312h.Companion, "Error while uploading payloads", 1);
        } else {
            AbstractC9799R4.m10419a(C8312h.Companion, AbstractC21323q.m21718e("\n                    | Error uploading events from batch file\n                    | fileUrl=\"" + file.getPath() + "\"\n                    | msg=" + exc.getMessage() + "\n                "), 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static String m9552c(AbstractC12774a abstractC12774a) {
        C11527o c11527o = AbstractC10628h.f31539a;
        c11527o.getClass();
        C16644c c16644cM12917j = AbstractC11523k.m12917j(c11527o.m12904c(AbstractC12774a.Companion.serializer(), abstractC12774a));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : c16644cM12917j.f53331Y.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC16643b abstractC16643b = (AbstractC16643b) entry.getValue();
            if (!AbstractC16544l.m18089b(str, "userId") || !AbstractC21322p.m21681O(AbstractC11523k.m12918k(abstractC16643b).mo12922f())) {
                if (!AbstractC16544l.m18089b(str, "traits") || !AbstractC16544l.m18089b(abstractC16643b, AbstractC8320p.f25941a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        C11515c c11515c = AbstractC11516d.f34842d;
        c11515c.getClass();
        return c11515c.m12905d(new C11131E(C11181o0.f33827a, C11524l.f34887a, 1), linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final void m9553b() {
        if (this.f27178h) {
            this.f27178h = false;
            this.f27176f.mo2516e(null);
            this.f27175e.mo2516e(null);
            Iterator it = this.f27173c.iterator();
            while (it.hasNext()) {
                ((InterfaceC10398b) it.next()).mo10899g();
            }
        }
    }
}
