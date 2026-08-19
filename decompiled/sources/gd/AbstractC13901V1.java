package gd;

import kotlin.jvm.internal.AbstractC16544l;
import p038Ba.AbstractC0865o;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;

/* JADX INFO: renamed from: gd.V1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13901V1 extends AbstractC0865o {

    /* JADX INFO: renamed from: d */
    public final InterfaceC3756d f43950d;

    /* JADX INFO: renamed from: e */
    public final String f43951e;

    public AbstractC13901V1(InterfaceC3756d interfaceC3756d) {
        super(EnumC13945h2.None, EnumC13884P1.GrowthByUser, "share_prompt_on_screenshot");
        this.f43950d = interfaceC3756d;
        this.f43951e = "none";
    }

    /* JADX INFO: renamed from: s */
    public final Enum m15476s(String str) {
        Object obj;
        Object[] enumConstants = AbstractC8138m0.m8667b(this.f43950d).getEnumConstants();
        AbstractC16544l.m18093f(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i10];
            if (AbstractC16544l.m18089b(((EnumC13945h2) ((InterfaceC13921b2) ((Enum) obj))).f43997Y, str)) {
                break;
            }
            i10++;
        }
        Enum r6 = (Enum) obj;
        return r6 == null ? (Enum) this.f2432b : r6;
    }
}
