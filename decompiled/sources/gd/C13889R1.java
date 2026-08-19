package gd;

import kotlin.jvm.internal.AbstractC16544l;
import p248Jk.InterfaceC4473d;
import p451Sb.C7102a;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: gd.R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13889R1 implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43937a;

    /* JADX INFO: renamed from: b */
    public final C7102a f43938b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f43939c;

    public C13889R1(C7102a c7102a, InterfaceC17068a experimentManager, int i10) {
        this.f43937a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(experimentManager, "experimentManager");
                this.f43938b = c7102a;
                this.f43939c = experimentManager;
                break;
            case 2:
                AbstractC16544l.m18094g(experimentManager, "layerManager");
                this.f43938b = c7102a;
                this.f43939c = experimentManager;
                break;
            case 3:
                AbstractC16544l.m18094g(experimentManager, "statsigInstance");
                this.f43938b = c7102a;
                this.f43939c = experimentManager;
                break;
            default:
                AbstractC16544l.m18094g(experimentManager, "configurationManager");
                this.f43938b = c7102a;
                this.f43939c = experimentManager;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f43937a) {
            case 0:
                Object obj = this.f43939c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                C13969n2 c13969n2 = (C13969n2) obj;
                C7102a module = this.f43938b;
                AbstractC16544l.m18094g(module, "module");
                return c13969n2;
            case 1:
                Object obj2 = this.f43939c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj2;
                C7102a module2 = this.f43938b;
                AbstractC16544l.m18094g(module2, "module");
                return interfaceC13849E;
            case 2:
                Object obj3 = this.f43939c.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                C13993t2 c13993t2 = (C13993t2) obj3;
                C7102a module3 = this.f43938b;
                AbstractC16544l.m18094g(module3, "module");
                return c13993t2;
            default:
                Object obj4 = this.f43939c.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                C13985r2 c13985r2 = (C13985r2) obj4;
                C7102a module4 = this.f43938b;
                AbstractC16544l.m18094g(module4, "module");
                return c13985r2;
        }
    }
}
