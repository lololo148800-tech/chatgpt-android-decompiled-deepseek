package p148Fi;

import ao.AbstractC11137K;
import bo.AbstractC11523k;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;

/* JADX INFO: renamed from: Fi.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C2843o extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C2843o f8589d = new C2843o(AbstractC16526C.f51263a.mo5693b(AbstractC2841n.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        AbstractC16643b abstractC16643b = (AbstractC16643b) AbstractC11523k.m12917j(element).get("type");
        String strM12913f = abstractC16643b != null ? AbstractC11523k.m12913f(AbstractC11523k.m12918k(abstractC16643b)) : null;
        if (strM12913f != null) {
            switch (strM12913f.hashCode()) {
                case -2088972283:
                    if (strM12913f.equals("conversation_update")) {
                        return C2833k.Companion.serializer();
                    }
                    break;
                case -1866384104:
                    if (strM12913f.equals("speaking_update")) {
                        return C2764G.Companion.serializer();
                    }
                    break;
                case -1480388560:
                    if (strM12913f.equals("performance")) {
                        return C2855u.Companion.serializer();
                    }
                    break;
                case -1423067778:
                    if (strM12913f.equals("streaming_message_update")) {
                        return C2778N.Companion.serializer();
                    }
                    break;
                case -275492528:
                    if (strM12913f.equals("tool_update")) {
                        return C2791U.Companion.serializer();
                    }
                    break;
                case 160452903:
                    if (strM12913f.equals("usage_update")) {
                        return C2807b0.Companion.serializer();
                    }
                    break;
                case 378231863:
                    if (strM12913f.equals("state_update")) {
                        return C2770J.Companion.serializer();
                    }
                    break;
            }
        }
        return C2799Y.INSTANCE.serializer();
    }
}
