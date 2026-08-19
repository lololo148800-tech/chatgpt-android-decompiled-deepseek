package p409Qk;

import io.ktor.client.engine.okhttp.OkHttpEngineContainer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.AbstractC16544l;
import p1091wn.AbstractC21031l;
import p509Uk.C7708a;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: renamed from: Qk.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6756g {

    /* JADX INFO: renamed from: a */
    public static final C7708a f21688a;

    static {
        C7708a c7708aMo7192a;
        try {
            Iterator it = Arrays.asList(new OkHttpEngineContainer()).iterator();
            AbstractC16544l.m18093f(it, WGTYqNchEpHca.cedIiC);
            InterfaceC6755f interfaceC6755f = (InterfaceC6755f) AbstractC21031l.m21489m(AbstractC21031l.m21483g(it));
            if (interfaceC6755f == null || (c7708aMo7192a = interfaceC6755f.mo7192a()) == null) {
                throw new IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
            }
            f21688a = c7708aMo7192a;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
