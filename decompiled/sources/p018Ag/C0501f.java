package p018Ag;

import bo.AbstractC11523k;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8056b6;
import p754fl.C13693c;

/* JADX INFO: renamed from: Ag.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0501f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1630Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13693c f1631Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0501f(C13693c c13693c, int i10) {
        super(2);
        this.f1630Y = i10;
        this.f1631Z = c13693c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1630Y) {
            case 0:
                String key = (String) obj;
                AbstractC16643b jsonElement = (AbstractC16643b) obj2;
                AbstractC16544l.m18094g(key, "key");
                AbstractC16544l.m18094g(jsonElement, "jsonElement");
                if (jsonElement instanceof AbstractC16645d) {
                    AbstractC8056b6.m8452c(this.f1631Z, key, AbstractC11523k.m12913f((AbstractC16645d) jsonElement));
                    return C17296C.f55119a;
                }
                throw new IllegalArgumentException(("Not implemented for non-primitive type " + AbstractC16526C.f51263a.mo5693b(jsonElement.getClass())).toString());
            case 1:
                String key2 = (String) obj;
                AbstractC16643b jsonElement2 = (AbstractC16643b) obj2;
                AbstractC16544l.m18094g(key2, "key");
                AbstractC16544l.m18094g(jsonElement2, "jsonElement");
                if (jsonElement2 instanceof AbstractC16645d) {
                    AbstractC8056b6.m8452c(this.f1631Z, key2, AbstractC11523k.m12913f((AbstractC16645d) jsonElement2));
                    return C17296C.f55119a;
                }
                throw new IllegalArgumentException(("Not implemented for non-primitive type " + AbstractC16526C.f51263a.mo5693b(jsonElement2.getClass())).toString());
            case 2:
                String key3 = (String) obj;
                AbstractC16643b jsonElement3 = (AbstractC16643b) obj2;
                AbstractC16544l.m18094g(key3, "key");
                AbstractC16544l.m18094g(jsonElement3, "jsonElement");
                if (jsonElement3 instanceof AbstractC16645d) {
                    AbstractC8056b6.m8452c(this.f1631Z, key3, AbstractC11523k.m12913f((AbstractC16645d) jsonElement3));
                    return C17296C.f55119a;
                }
                throw new IllegalArgumentException(("Not implemented for non-primitive type " + AbstractC16526C.f51263a.mo5693b(jsonElement3.getClass())).toString());
            default:
                String key4 = (String) obj;
                AbstractC16643b jsonElement4 = (AbstractC16643b) obj2;
                AbstractC16544l.m18094g(key4, "key");
                AbstractC16544l.m18094g(jsonElement4, "jsonElement");
                if (jsonElement4 instanceof AbstractC16645d) {
                    AbstractC8056b6.m8452c(this.f1631Z, key4, AbstractC11523k.m12913f((AbstractC16645d) jsonElement4));
                    return C17296C.f55119a;
                }
                throw new IllegalArgumentException(("Not implemented for non-primitive type " + AbstractC16526C.f51263a.mo5693b(jsonElement4.getClass())).toString());
        }
    }
}
