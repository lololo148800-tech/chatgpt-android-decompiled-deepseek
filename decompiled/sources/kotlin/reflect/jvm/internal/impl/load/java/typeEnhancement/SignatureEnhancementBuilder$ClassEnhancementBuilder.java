package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mm.C17309l;
import p033B5.C0819c;
import p049Bm.InterfaceC1436k;
import p606Yn.C10107h;
import p648an.C10760h;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17692z;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureEnhancementBuilder$ClassEnhancementBuilder {

    /* JADX INFO: renamed from: a */
    public final String f51998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C10760h f51999b;

    public SignatureEnhancementBuilder$ClassEnhancementBuilder(C10760h c10760h, String className) {
        AbstractC16544l.m18094g(className, "className");
        this.f51999b = c10760h;
        this.f51998a = className;
    }

    public static /* synthetic */ void function$default(SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder, String str, String str2, InterfaceC1436k interfaceC1436k, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        signatureEnhancementBuilder$ClassEnhancementBuilder.function(str, str2, interfaceC1436k);
    }

    public final void function(String name, String str, InterfaceC1436k block) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(block, "block");
        LinkedHashMap linkedHashMap = this.f51999b.f31972a;
        FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, name, str);
        block.invoke(functionEnhancementBuilder);
        C17309l c17309lBuild = functionEnhancementBuilder.build();
        linkedHashMap.put(c17309lBuild.f55136Y, c17309lBuild.f55137Z);
    }

    public final String getClassName() {
        return this.f51998a;
    }

    public final class FunctionEnhancementBuilder {

        /* JADX INFO: renamed from: a */
        public final String f52000a;

        /* JADX INFO: renamed from: b */
        public final String f52001b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f52002c;

        /* JADX INFO: renamed from: d */
        public C17309l f52003d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SignatureEnhancementBuilder$ClassEnhancementBuilder f52004e;

        public FunctionEnhancementBuilder(SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder, String functionName, String str) {
            AbstractC16544l.m18094g(functionName, "functionName");
            this.f52004e = signatureEnhancementBuilder$ClassEnhancementBuilder;
            this.f52000a = functionName;
            this.f52001b = str;
            this.f52002c = new ArrayList();
            this.f52003d = new C17309l(TokenNames.f32021V, null);
        }

        public final C17309l build() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            String className = this.f52004e.getClassName();
            ArrayList arrayList = this.f52002c;
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((C17309l) it.next()).f55136Y);
            }
            String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(this.f52000a, arrayList2, (String) this.f52003d.f55136Y));
            TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.f52003d.f55137Z;
            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((TypeEnhancementInfo) ((C17309l) it2.next()).f55137Z);
            }
            return new C17309l(strSignature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList3, this.f52001b));
        }

        public final void parameter(String type, JavaTypeQualifiers... qualifiers) {
            TypeEnhancementInfo typeEnhancementInfo;
            AbstractC16544l.m18094g(type, "type");
            AbstractC16544l.m18094g(qualifiers, "qualifiers");
            ArrayList arrayList = this.f52002c;
            if (qualifiers.length == 0) {
                typeEnhancementInfo = null;
            } else {
                C10107h c10107h = new C10107h(new C0819c(qualifiers, 18), 2);
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(c10107h, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                Iterator it = c10107h.iterator();
                while (true) {
                    C17656A c17656a = (C17656A) it;
                    if (!c17656a.f56445Z.hasNext()) {
                        break;
                    }
                    C17692z c17692z = (C17692z) c17656a.next();
                    linkedHashMap.put(Integer.valueOf(c17692z.f56483a), (JavaTypeQualifiers) c17692z.f56484b);
                }
                typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
            }
            arrayList.add(new C17309l(type, typeEnhancementInfo));
        }

        public final void returns(JvmPrimitiveType type) {
            AbstractC16544l.m18094g(type, "type");
            String desc = type.getDesc();
            AbstractC16544l.m18093f(desc, "getDesc(...)");
            this.f52003d = new C17309l(desc, null);
        }

        public final void returns(String type, JavaTypeQualifiers... qualifiers) {
            AbstractC16544l.m18094g(type, "type");
            AbstractC16544l.m18094g(qualifiers, "qualifiers");
            C10107h c10107h = new C10107h(new C0819c(qualifiers, 18), 2);
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(c10107h, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
            Iterator it = c10107h.iterator();
            while (true) {
                C17656A c17656a = (C17656A) it;
                if (c17656a.f56445Z.hasNext()) {
                    C17692z c17692z = (C17692z) c17656a.next();
                    linkedHashMap.put(Integer.valueOf(c17692z.f56483a), (JavaTypeQualifiers) c17692z.f56484b);
                } else {
                    this.f52003d = new C17309l(type, new TypeEnhancementInfo(linkedHashMap));
                    return;
                }
            }
        }
    }
}
