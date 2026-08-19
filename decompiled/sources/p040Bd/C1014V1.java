package p040Bd;

import ao.AbstractC11137K;
import bo.AbstractC11523k;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;

/* JADX INFO: renamed from: Bd.V1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1014V1 extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C1014V1 f2819d = new C1014V1(AbstractC16526C.f51263a.mo5693b(InterfaceC1136o.class));

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        AbstractC16643b abstractC16643b = (AbstractC16643b) AbstractC11523k.m12917j(element).get("content_type");
        String strM12913f = abstractC16643b != null ? AbstractC11523k.m12913f(AbstractC11523k.m12918k(abstractC16643b)) : null;
        EnumC1124m[] enumC1124mArr = EnumC1124m.f3037Y;
        if (AbstractC16544l.m18089b(strM12913f, "text")) {
            return C1103i4.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(strM12913f, "execution_output")) {
            return C1157r2.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(strM12913f, "code") ? true : AbstractC16544l.m18089b(strM12913f, "tether_browsing_code")) {
            return C1118l.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(strM12913f, "multimodal_text")) {
            return C0921F3.Companion.serializer();
        }
        return AbstractC16544l.m18089b(strM12913f, "system_error") ? C1082f4.INSTANCE.serializer() : C1129m4.INSTANCE.serializer();
    }
}
