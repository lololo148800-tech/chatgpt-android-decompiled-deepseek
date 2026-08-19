package p040Bd;

import ao.AbstractC11137K;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;

/* JADX INFO: renamed from: Bd.t3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1170t3 extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C1170t3 f3120d = new C1170t3(AbstractC16526C.f51263a.mo5693b(InterfaceC1164s3.class));

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        C16644c c16644c = element instanceof C16644c ? (C16644c) element : null;
        if (c16644c == null) {
            throw new IllegalArgumentException("Expected JsonObject");
        }
        Object obj = c16644c.get("type");
        AbstractC16645d abstractC16645d = obj instanceof AbstractC16645d ? (AbstractC16645d) obj : null;
        return AbstractC16544l.m18089b(abstractC16645d != null ? abstractC16645d.mo12922f() : null, "file") ? C1140o3.Companion.serializer() : C1158r3.Companion.serializer();
    }
}
