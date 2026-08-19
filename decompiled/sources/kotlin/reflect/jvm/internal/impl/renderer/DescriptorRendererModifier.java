package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import p523V9.AbstractC7877E4;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[], still in use, count: 1, list:
  (r2v4 kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[]) from 0x00c8: INVOKE (r2v4 kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:201)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set<DescriptorRendererModifier> ALL;
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;
    public static final Companion Companion;

    /* JADX INFO: renamed from: Y */
    public final boolean f52787Y;

    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$Companion] */
    static {
        AbstractC7877E4.m8156j(new DescriptorRendererModifier[]{r0, r1, r4, r5, r7, r9, r11, r13, r15, r14, r12, r10, r8, r6});
        Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.Companion
        };
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.f52787Y) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = AbstractC17680n.m19328G0(arrayList);
        ALL = AbstractC17678l.m19293P(values());
    }

    public DescriptorRendererModifier(boolean z6) {
        super(str, i);
        this.f52787Y = z6;
    }

    public static DescriptorRendererModifier valueOf(String str) {
        return (DescriptorRendererModifier) Enum.valueOf(DescriptorRendererModifier.class, str);
    }

    public static DescriptorRendererModifier[] values() {
        return (DescriptorRendererModifier[]) f52786Z.clone();
    }
}
