package p929oi;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16642a;
import livekit.org.webrtc.WebrtcBuildVersion;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: oi.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18212m extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C18212m f58046Y = new C18212m(1, C18216q.class, "parseArray", "parseArray()Lkotlinx/serialization/json/JsonElement;", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18216q p10 = (C18216q) obj;
        AbstractC16544l.m18094g(p10, "p0");
        p10.f58052b++;
        if (p10.m19727g(']')) {
            return new C16642a(C17689w.f56480Y);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = p10.f58053c;
        arrayList2.add(WebrtcBuildVersion.maint_version);
        while (p10.m19724d()) {
            arrayList.add(p10.m19725e());
            if (!p10.m19724d()) {
                break;
            }
            if (p10.m19727g(']')) {
                arrayList2.remove(AbstractC17681o.m19381j(arrayList2));
                break;
            }
            if (!p10.m19727g(',')) {
                break;
            }
            arrayList2.set(AbstractC17681o.m19381j(arrayList2), String.valueOf(arrayList.size()));
        }
        return new C16642a(arrayList);
    }
}
