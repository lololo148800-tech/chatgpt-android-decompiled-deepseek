package p1122y6;

import android.content.Context;
import com.apollographql.apollo3.cache.normalized.sql.ApolloInitializer;
import io.sentry.clientreport.C15333a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0388h;
import p008A6.InterfaceC0381a;
import p034B6.C0843a;
import p1112xm.C21305i;
import p228J.AbstractC3812N;
import p593Y8.C9683j;
import p959q8.C18639a;

/* JADX INFO: renamed from: y6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21391b extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final C9683j f67900o0;

    public C21391b(String str) {
        AbstractC16526C.f51263a.mo5693b(InterfaceC0381a.class);
        C0843a c0843a = C0843a.f2349a;
        Context context = ApolloInitializer.f35956a;
        if (context == null) {
            AbstractC16544l.m18103p("context");
            throw null;
        }
        C9683j c9683j = new C9683j(c0843a, context, str, new C18639a(8), null, 240);
        super((char) 0, 13);
        this.f67900o0 = c9683j;
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: n */
    public final AbstractC3812N mo4534n() {
        C9683j driver = this.f67900o0;
        AbstractC16544l.m18094g(driver, "driver");
        AbstractC16526C.f51263a.mo5693b(InterfaceC0381a.class);
        ArrayList arrayList = new ArrayList();
        try {
            driver.m10279m(null, "SELECT name FROM sqlite_master WHERE type='table' ORDER BY name;", new C21305i(1, arrayList), 0, null);
        } catch (Exception e10) {
            Exception exc = new Exception("An exception occurred while looking up the table names", e10);
            System.out.println((Object) "Apollo: unhandled exception");
            exc.printStackTrace();
        }
        if (arrayList.isEmpty() || arrayList.contains("records")) {
            AbstractC16526C.f51263a.mo5693b(InterfaceC0381a.class);
            return new C21390a(new C15333a(new C0388h(driver)));
        }
        throw new IllegalStateException(("Apollo: Cannot find the 'records' table? (found '" + arrayList + "' instead)").toString());
    }
}
