package p1068vo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import mo.C17356w;
import p909nm.AbstractC17659D;
import p950po.C18530d;
import to.AbstractC20014e;

/* JADX INFO: renamed from: vo.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20653c {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet f65531a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public static final Map f65532b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r6 = C17356w.class.getPackage();
        String name = r6 != null ? r6.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C17356w.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC20014e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C18530d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f65532b = AbstractC17659D.m19254p(linkedHashMap);
    }
}
