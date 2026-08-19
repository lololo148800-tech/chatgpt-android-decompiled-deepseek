package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;
import p1047un.C20392a;
import p1113xn.C21319m;

/* JADX INFO: loaded from: classes2.dex */
public final class Checks {

    /* JADX INFO: renamed from: a */
    public final Name f53287a;

    /* JADX INFO: renamed from: b */
    public final C21319m f53288b;

    /* JADX INFO: renamed from: c */
    public final Collection f53289c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1436k f53290d;

    /* JADX INFO: renamed from: e */
    public final Check[] f53291e;

    public Checks(Name name, C21319m c21319m, Collection collection, InterfaceC1436k interfaceC1436k, Check... checkArr) {
        this.f53287a = name;
        this.f53288b = c21319m;
        this.f53289c = collection;
        this.f53290d = interfaceC1436k;
        this.f53291e = checkArr;
    }

    public final CheckResult checkAll(FunctionDescriptor functionDescriptor) {
        AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
        for (Check check : this.f53291e) {
            String strInvoke = check.invoke(functionDescriptor);
            if (strInvoke != null) {
                return new CheckResult.IllegalSignature(strInvoke);
            }
        }
        String str = (String) this.f53290d.invoke(functionDescriptor);
        return str != null ? new CheckResult.IllegalSignature(str) : CheckResult.SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(FunctionDescriptor functionDescriptor) {
        AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
        Name name = this.f53287a;
        if (name != null && !AbstractC16544l.m18089b(functionDescriptor.getName(), name)) {
            return false;
        }
        C21319m c21319m = this.f53288b;
        if (c21319m != null) {
            String strAsString = functionDescriptor.getName().asString();
            AbstractC16544l.m18093f(strAsString, "asString(...)");
            if (!c21319m.m21664d(strAsString)) {
                return false;
            }
        }
        Collection collection = this.f53289c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, InterfaceC1436k interfaceC1436k, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (i10 & 4) != 0 ? C20392a.f64490Z : interfaceC1436k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Name name, Check[] checks, InterfaceC1436k additionalChecks) {
        this(name, (C21319m) null, (Collection) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(checks, "checks");
        AbstractC16544l.m18094g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(C21319m c21319m, Check[] checkArr, InterfaceC1436k interfaceC1436k, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21319m, checkArr, (i10 & 4) != 0 ? C20392a.f64491o0 : interfaceC1436k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(C21319m regex, Check[] checks, InterfaceC1436k additionalChecks) {
        this((Name) null, regex, (Collection) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        AbstractC16544l.m18094g(regex, "regex");
        AbstractC16544l.m18094g(checks, "checks");
        AbstractC16544l.m18094g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, InterfaceC1436k interfaceC1436k, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (i10 & 4) != 0 ? C20392a.f64492p0 : interfaceC1436k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection<Name> nameList, Check[] checks, InterfaceC1436k additionalChecks) {
        this((Name) null, (C21319m) null, nameList, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        AbstractC16544l.m18094g(nameList, "nameList");
        AbstractC16544l.m18094g(checks, "checks");
        AbstractC16544l.m18094g(additionalChecks, "additionalChecks");
    }
}
