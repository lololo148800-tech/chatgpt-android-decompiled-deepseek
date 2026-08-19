package p1126yd;

import ao.AbstractC11137K;
import bo.AbstractC11523k;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;

/* JADX INFO: renamed from: yd.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C21506x extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C21506x f68124d = new C21506x(AbstractC16526C.f51263a.mo5693b(AbstractC21504w.class));

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) throws IOException {
        AbstractC16544l.m18094g(element, "element");
        AbstractC16643b abstractC16643b = (AbstractC16643b) AbstractC11523k.m12917j(element).get("kind");
        String strMo12922f = abstractC16643b != null ? AbstractC11523k.m12918k(abstractC16643b).mo12922f() : null;
        if (AbstractC16544l.m18089b(strMo12922f, "message")) {
            return C21424J0.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(strMo12922f, "gizmo")) {
            return C21507x0.Companion.serializer();
        }
        if (strMo12922f != null) {
            return C21430M0.Companion.serializer();
        }
        throw new IOException("Missing 'kind' field in ConversationSearchItemPayload");
    }
}
