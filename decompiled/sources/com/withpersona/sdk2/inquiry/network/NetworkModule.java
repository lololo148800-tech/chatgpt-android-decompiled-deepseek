package com.withpersona.sdk2.inquiry.network;

import android.content.Context;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Build;
import bj.AbstractC11440E;
import bj.AbstractC11457d;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11455b;
import bj.C11456c;
import bj.C11458e;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import bj.InterfaceC11470q;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import dj.AbstractC13178c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mo.C17327D;
import mo.C17348o;
import mo.C17352s;
import mo.C17355v;
import mo.C17356w;
import mo.C17358y;
import mo.EnumC17357x;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import no.AbstractC17708b;
import p001A.C0017I0;
import p1027tp.C20050O;
import p1049up.C20408a;
import p185H6.C3246b;
import p571X9.AbstractC9129F2;
import p571X9.AbstractC9282f0;
import p603Yj.C10071d;
import p791hj.C14522e;
import p814ik.C15031c;
import p814ik.C15034f;
import p814ik.InterfaceC15029a;
import p814ik.InterfaceC15030b;
import p817j$.util.Objects;
import p909nm.AbstractC17678l;
import ro.C19261e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u00070\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00070\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJN\u0010\u0019\u001a\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\t0\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJG\u0010\u001c\u001a\u00020\u001b2\u0011\u0010!\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b 0\r2\u0010\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0\r2\u0011\u0010%\u001a\r\u0012\t\u0012\u00070$¢\u0006\u0002\b 0\rH\u0007¢\u0006\u0004\b\u001c\u0010&J,\u0010+\u001a\u00020*2\u000b\u0010(\u001a\u00070\u0004¢\u0006\u0002\b'2\u0006\u0010)\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.¨\u00061"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/NetworkModule;", "", "", "useServerStyle", "", "routingCountry", "locale", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/HttpHeader;", "keyInflection", "()Ljava/lang/String;", "useServerStyles", "", "Lmo/r;", "interceptors", "", "headers", "Landroid/content/Context;", "context", "Lik/a;", "appSetIDHelper", "Lik/b;", "deviceInfoProvider", "Lmo/w;", "okhttpClient", "(Ljava/util/Set;Ljava/util/Map;Landroid/content/Context;Lik/a;Lik/b;)Lmo/w;", "Lbj/L;", "moshi", "responseInterceptor", "(Lbj/L;)Lmo/r;", "interceptor", "Lcom/withpersona/sdk2/inquiry/network/MoshiJsonAdapter;", "jsonAdapters", "Lcom/withpersona/sdk2/inquiry/network/JsonAdapterBinding;", "jsonAdapterBindings", "Lbj/q;", "jsonAdapterFactory", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lbj/L;", "Lcom/withpersona/sdk2/inquiry/network/ServerEndpoint;", "serverEndpoint", "okHttpClient", "Ltp/O;", "retrofit", "(Ljava/lang/String;Lmo/w;Lbj/L;)Ltp/O;", "Z", "Ljava/lang/String;", "Companion", "NetworkConstants", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NetworkModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String locale;
    private String routingCountry;
    private final boolean useServerStyle;

    @Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/NetworkModule$Companion;", "", "<init>", "()V", "", "Lbj/q;", "Lcom/withpersona/sdk2/inquiry/network/MoshiJsonAdapter;", "provideMoshiJsonAdapterFactory", "()Ljava/util/Set;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<InterfaceC11470q> provideMoshiJsonAdapterFactory() {
            return AbstractC17678l.m19293P(new InterfaceC11470q[]{ErrorResponse.INSTANCE.getAdapter(), InternalErrorInfo.INSTANCE.createAdapter(), NextStep.INSTANCE.createAdapter(), UiComponentConfig.INSTANCE.createAdapter(), UiComponentConfig.LocalImage.INSTANCE.createAdapter(), C12893Id.INSTANCE.createAdapter()});
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/NetworkModule$NetworkConstants;", "", "()V", "HEADER_KEY_PERSONA_COUNTRY", "", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class NetworkConstants {
        public static final String HEADER_KEY_PERSONA_COUNTRY = "Persona-Country";
        public static final NetworkConstants INSTANCE = new NetworkConstants();

        private NetworkConstants() {
        }
    }

    public NetworkModule(boolean z6, String str, String str2) {
        this.useServerStyle = z6;
        this.routingCountry = str;
        this.locale = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17327D interceptor$lambda$6(C11447L c11447l, InterfaceC17350q interfaceC17350q) {
        String str;
        EnumC17357x enumC17357x = EnumC17357x.HTTP_2;
        try {
            return ((C19261e) interfaceC17350q).m20335b(((C19261e) interfaceC17350q).f61057e);
        } catch (ConnectException e10) {
            ArrayList arrayList = new ArrayList(20);
            C17358y request = ((C19261e) interfaceC17350q).f61057e;
            AbstractC16544l.m18094g(request, "request");
            String localizedMessage = e10.getLocalizedMessage();
            str = localizedMessage != null ? localizedMessage : "";
            Pattern pattern = C17352s.f55296e;
            C17352s c17352sM9857c = AbstractC9282f0.m9857c("application/json");
            c11447l.getClass();
            String content = c11447l.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create(e10.getLocalizedMessage()));
            AbstractC16544l.m18094g(content, "content");
            return new C17327D(request, enumC17357x, str, 0, null, new C17348o((String[]) arrayList.toArray(new String[0])), AbstractC9129F2.m9668b(content, c17352sM9857c), null, null, null, 0L, 0L, null);
        } catch (SocketTimeoutException e11) {
            ArrayList arrayList2 = new ArrayList(20);
            C17358y request2 = ((C19261e) interfaceC17350q).f61057e;
            AbstractC16544l.m18094g(request2, "request");
            String localizedMessage2 = e11.getLocalizedMessage();
            str = localizedMessage2 != null ? localizedMessage2 : "";
            Pattern pattern2 = C17352s.f55296e;
            C17352s c17352sM9857c2 = AbstractC9282f0.m9857c("application/json");
            c11447l.getClass();
            String content2 = c11447l.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create(e11.getLocalizedMessage()));
            AbstractC16544l.m18094g(content2, "content");
            return new C17327D(request2, enumC17357x, str, 0, null, new C17348o((String[]) arrayList2.toArray(new String[0])), AbstractC9129F2.m9668b(content2, c17352sM9857c2), null, null, null, 0L, 0L, null);
        } catch (UnknownHostException e12) {
            ArrayList arrayList3 = new ArrayList(20);
            C17358y request3 = ((C19261e) interfaceC17350q).f61057e;
            AbstractC16544l.m18094g(request3, "request");
            String localizedMessage3 = e12.getLocalizedMessage();
            str = localizedMessage3 != null ? localizedMessage3 : "";
            Pattern pattern3 = C17352s.f55296e;
            C17352s c17352sM9857c3 = AbstractC9282f0.m9857c("application/json");
            c11447l.getClass();
            String content3 = c11447l.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create(e12.getLocalizedMessage()));
            AbstractC16544l.m18094g(content3, "content");
            return new C17327D(request3, enumC17357x, str, 0, null, new C17348o((String[]) arrayList3.toArray(new String[0])), AbstractC9129F2.m9668b(content3, c17352sM9857c3), null, null, null, 0L, 0L, null);
        } catch (IOException e13) {
            ArrayList arrayList4 = new ArrayList(20);
            C17358y request4 = ((C19261e) interfaceC17350q).f61057e;
            AbstractC16544l.m18094g(request4, "request");
            String localizedMessage4 = e13.getLocalizedMessage();
            str = localizedMessage4 != null ? localizedMessage4 : "";
            Pattern pattern4 = C17352s.f55296e;
            C17352s c17352sM9857c4 = AbstractC9282f0.m9857c("application/json");
            c11447l.getClass();
            String content4 = c11447l.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create(e13.getLocalizedMessage()));
            AbstractC16544l.m18094g(content4, "content");
            return new C17327D(request4, enumC17357x, str, 0, null, new C17348o((String[]) arrayList4.toArray(new String[0])), AbstractC9129F2.m9668b(content4, c17352sM9857c4), null, null, null, 0L, 0L, null);
        }
    }

    public static final Set<InterfaceC11470q> provideMoshiJsonAdapterFactory() {
        return INSTANCE.provideMoshiJsonAdapterFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17327D responseInterceptor$lambda$5(NetworkModule networkModule, InterfaceC17350q interfaceC17350q) {
        C17327D c17327dM20335b = ((C19261e) interfaceC17350q).m20335b(((C19261e) interfaceC17350q).f61057e);
        String strM19012f = c17327dM20335b.f55178r0.m19012f(NetworkConstants.HEADER_KEY_PERSONA_COUNTRY);
        if (strM19012f != null) {
            networkModule.routingCountry = strM19012f;
        }
        return c17327dM20335b;
    }

    public final InterfaceC17351r interceptor(C11447L moshi) {
        return new C10071d(moshi, 1);
    }

    public final String keyInflection() {
        return "camel";
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x013d  */
    public final C11447L moshi(Set<Object> jsonAdapters, Set<JsonAdapterBinding<?>> jsonAdapterBindings, Set<InterfaceC11470q> jsonAdapterFactory) {
        Object obj;
        int i10;
        String str;
        boolean z6;
        AbstractC11457d c11456c;
        Class<AbstractC11471r> cls;
        String str2;
        AbstractC11457d c11456c2;
        AbstractC11457d abstractC11457dM12863a;
        boolean z10;
        boolean z11 = true;
        C3246b c3246b = new C3246b();
        Iterator it = jsonAdapters.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                throw new IllegalArgumentException("adapter == null");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> superclass = next.getClass();
            while (superclass != Object.class) {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                int i11 = 0;
                for (int length = declaredMethods.length; i11 < length; length = i10) {
                    Method method = declaredMethods[i11];
                    Class<AbstractC11471r> cls2 = AbstractC11471r.class;
                    String str3 = "\n    ";
                    Class<?> cls3 = superclass;
                    String str4 = "Unexpected signature for ";
                    if (method.isAnnotationPresent(InterfaceC11453S.class)) {
                        method.setAccessible(z11);
                        Type genericReturnType = method.getGenericReturnType();
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == AbstractC11440E.class && genericReturnType == Void.TYPE) {
                            int length2 = genericParameterTypes.length;
                            int i12 = 2;
                            while (true) {
                                if (i12 < length2) {
                                    int i13 = length2;
                                    Type type = genericParameterTypes[i12];
                                    String str5 = str3;
                                    if ((type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType() == cls2) {
                                        i12++;
                                        length2 = i13;
                                        str3 = str5;
                                    } else {
                                        str2 = str5;
                                    }
                                } else {
                                    str2 = str3;
                                    cls2 = cls2;
                                    obj = "Nullable";
                                    method = method;
                                    i11 = i11;
                                    declaredMethods = declaredMethods;
                                    cls3 = cls3;
                                    i10 = length;
                                    c11456c2 = new C11455b(genericParameterTypes[1], AbstractC13178c.m14831e(parameterAnnotations[1]), next, method, genericParameterTypes.length, 2, true, 0);
                                }
                                abstractC11457dM12863a = C11458e.m12863a(arrayList, c11456c2.f34647a, c11456c2.f34648b);
                                if (abstractC11457dM12863a == null) {
                                    throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + abstractC11457dM12863a.f34650d + str2 + c11456c2.f34650d);
                                }
                                arrayList.add(c11456c2);
                                method = method;
                                str = str2;
                            }
                        } else {
                            str2 = "\n    ";
                        }
                        if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
                            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                        }
                        Set set = AbstractC13178c.f41820a;
                        Set setM14831e = AbstractC13178c.m14831e(method.getAnnotations());
                        Set setM14831e2 = AbstractC13178c.m14831e(parameterAnnotations[0]);
                        Annotation[] annotationArr = parameterAnnotations[0];
                        int length3 = annotationArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length3) {
                                z10 = false;
                                break;
                            }
                            if (annotationArr[i14].annotationType().getSimpleName().equals("Nullable")) {
                                z10 = true;
                                break;
                            }
                            i14++;
                        }
                        i10 = length;
                        c11456c2 = new C11456c(genericParameterTypes[0], setM14831e2, next, method, genericParameterTypes.length, z10, genericParameterTypes, genericReturnType, setM14831e2, setM14831e, 0);
                        abstractC11457dM12863a = C11458e.m12863a(arrayList, c11456c2.f34647a, c11456c2.f34648b);
                        if (abstractC11457dM12863a == null) {
                            throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + abstractC11457dM12863a.f34650d + str2 + c11456c2.f34650d);
                        }
                        arrayList.add(c11456c2);
                        method = method;
                        str = str2;
                    } else {
                        c3246b = c3246b;
                        cls2 = cls2;
                        obj = "Nullable";
                        i11 = i11;
                        i10 = length;
                        declaredMethods = declaredMethods;
                        str4 = "Unexpected signature for ";
                        arrayList2 = arrayList2;
                        arrayList = arrayList;
                        cls3 = cls3;
                        str = "\n    ";
                    }
                    if (method.isAnnotationPresent(InterfaceC11467n.class)) {
                        method.setAccessible(true);
                        Type genericReturnType2 = method.getGenericReturnType();
                        Set set2 = AbstractC13178c.f41820a;
                        Set setM14831e3 = AbstractC13178c.m14831e(method.getAnnotations());
                        Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                        if (genericParameterTypes2.length >= 1 && genericParameterTypes2[0] == AbstractC11477x.class && genericReturnType2 != Void.TYPE) {
                            int length4 = genericParameterTypes2.length;
                            int i15 = 1;
                            while (true) {
                                if (i15 < length4) {
                                    Type type2 = genericParameterTypes2[i15];
                                    if (!(type2 instanceof ParameterizedType) || ((ParameterizedType) type2).getRawType() != (cls = cls2)) {
                                        if (genericParameterTypes2.length == 1) {
                                        }
                                        throw new IllegalArgumentException(str4 + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                                    }
                                    i15++;
                                    cls2 = cls;
                                } else {
                                    c11456c = new C11455b(genericReturnType2, setM14831e3, next, method, genericParameterTypes2.length, 1, true, 1);
                                }
                            }
                        } else {
                            if (genericParameterTypes2.length == 1 || genericReturnType2 == Void.TYPE) {
                                throw new IllegalArgumentException(str4 + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                            }
                            Set setM14831e4 = AbstractC13178c.m14831e(parameterAnnotations2[0]);
                            Annotation[] annotationArr2 = parameterAnnotations2[0];
                            int length5 = annotationArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length5) {
                                    z6 = false;
                                    break;
                                }
                                if (annotationArr2[i16].annotationType().getSimpleName().equals(obj)) {
                                    z6 = true;
                                    break;
                                }
                                i16++;
                            }
                            c11456c = new C11456c(genericReturnType2, setM14831e3, next, method, genericParameterTypes2.length, z6, genericParameterTypes2, genericReturnType2, setM14831e4, setM14831e3, 1);
                        }
                        AbstractC11457d abstractC11457dM12863a2 = C11458e.m12863a(arrayList2, c11456c.f34647a, c11456c.f34648b);
                        if (abstractC11457dM12863a2 != null) {
                            throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + abstractC11457dM12863a2.f34650d + str + c11456c.f34650d);
                        }
                        arrayList2.add(c11456c);
                    }
                    z11 = true;
                    i11++;
                    it = it;
                    arrayList2 = arrayList2;
                    arrayList = arrayList;
                    superclass = cls3;
                    c3246b = c3246b;
                    declaredMethods = declaredMethods;
                }
                superclass = superclass.getSuperclass();
                c3246b = c3246b;
                z11 = true;
            }
            C3246b c3246b2 = c3246b;
            Iterator it2 = it;
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = arrayList;
            if (arrayList4.isEmpty() && arrayList3.isEmpty()) {
                throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on ".concat(next.getClass().getName()));
            }
            c3246b2.m4134a(new C11458e(arrayList4, arrayList3, 0));
            it = it2;
            c3246b = c3246b2;
            z11 = true;
        }
        C3246b c3246b3 = c3246b;
        Iterator<T> it3 = jsonAdapterBindings.iterator();
        while (it3.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it3.next();
            Class clazz = jsonAdapterBinding.getClazz();
            AbstractC11471r jsonAdapter = jsonAdapterBinding.getJsonAdapter();
            ArrayList arrayList5 = C11447L.f34609d;
            if (clazz == null) {
                throw new IllegalArgumentException("type == null");
            }
            if (jsonAdapter == null) {
                throw new IllegalArgumentException("jsonAdapter == null");
            }
            c3246b3.m4134a(new C11458e(clazz, jsonAdapter, 1));
        }
        Iterator<T> it4 = jsonAdapterFactory.iterator();
        while (it4.hasNext()) {
            c3246b3.m4134a((InterfaceC11470q) it4.next());
        }
        return new C11447L(c3246b3);
    }

    public final C17356w okhttpClient(Set<InterfaceC17351r> interceptors, final Map<String, String> headers, final Context context, final InterfaceC15029a appSetIDHelper, final InterfaceC15030b deviceInfoProvider) {
        C17355v c17355v = new C17355v();
        c17355v.f55318d.add(new InterfaceC17351r() { // from class: com.withpersona.sdk2.inquiry.network.NetworkModule$okhttpClient$$inlined$-addNetworkInterceptor$1
            @Override // mo.InterfaceC17351r
            public final C17327D intercept(InterfaceC17350q interfaceC17350q) {
                C19261e c19261e = (C19261e) interfaceC17350q;
                C14522e c14522eM19038b = c19261e.f61057e.m19038b();
                if (!c19261e.f61057e.f55381c.m19015p().contains(SIPHeaderNames.ACCEPT)) {
                    c14522eM19038b.m16024r(SIPHeaderNames.ACCEPT, "application/json");
                }
                c14522eM19038b.m16024r("Persona-Version", "2023-08-08");
                ((C15034f) deviceInfoProvider).getClass();
                c14522eM19038b.m16024r("Persona-Device-Manufacturer", Build.MANUFACTURER);
                ((C15034f) deviceInfoProvider).getClass();
                c14522eM19038b.m16024r("Persona-Device-Model", Build.MODEL);
                c14522eM19038b.m16024r("Persona-Device-OS", "Android");
                ((C15034f) deviceInfoProvider).getClass();
                c14522eM19038b.m16024r("Persona-Device-OS-Version", Build.VERSION.RELEASE);
                InterfaceC15029a interfaceC15029a = appSetIDHelper;
                Context context2 = context;
                C15031c c15031c = (C15031c) interfaceC15029a;
                c15031c.getClass();
                AbstractC16544l.m18094g(context2, "context");
                if (c15031c.f46728a.length() == 0) {
                    c15031c.m16159a(context2);
                }
                c14522eM19038b.m16024r("Persona-Device-Vendor-Id", c15031c.f46728a);
                c14522eM19038b.m16024r("Persona-Style-Variant", (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light");
                String string = this.locale;
                if (string == null) {
                    string = Locale.getDefault().toString();
                }
                c14522eM19038b.m16024r("Persona-Device-Locale", string);
                String str = this.routingCountry;
                if (str != null) {
                    c14522eM19038b.m16024r(NetworkModule.NetworkConstants.HEADER_KEY_PERSONA_COUNTRY, str);
                }
                for (Map.Entry entry : headers.entrySet()) {
                    c14522eM19038b.m16024r((String) entry.getKey(), (String) entry.getValue());
                }
                return c19261e.m20335b(C12889a.m14544a(C12889a.f40850a, c14522eM19038b.m16017i(), 0L, 1, null));
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c17355v.m19033c(1L, timeUnit);
        c17355v.f55340z = AbstractC17708b.m19410b(1L, timeUnit);
        c17355v.m19031a(1L, timeUnit);
        for (InterfaceC17351r interceptor : interceptors) {
            AbstractC16544l.m18094g(interceptor, "interceptor");
            c17355v.f55317c.add(interceptor);
        }
        return new C17356w(c17355v);
    }

    public final InterfaceC17351r responseInterceptor(C11447L moshi) {
        return new C10071d(this, 2);
    }

    public final C20050O retrofit(String serverEndpoint, C17356w okHttpClient, C11447L moshi) {
        C0017I0 c0017i0 = new C0017I0(8);
        Objects.requireNonNull(okHttpClient, "client == null");
        c0017i0.f65Z = okHttpClient;
        c0017i0.m74i(serverEndpoint);
        if (moshi == null) {
            throw new NullPointerException("moshi == null");
        }
        ((ArrayList) c0017i0.f67p0).add(new C20408a(moshi));
        return c0017i0.m75j();
    }

    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }
}
