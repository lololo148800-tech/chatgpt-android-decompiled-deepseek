package p247Jj;

import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import p022Ak.EnumC0543d;
import p025An.C0644w;

/* JADX INFO: renamed from: Jj.E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4379E {
    /* JADX INFO: renamed from: a */
    public static final EnumC0543d m5173a(InternalErrorInfo internalErrorInfo) {
        AbstractC16544l.m18094g(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return EnumC0543d.f1725p0;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return EnumC0543d.f1726q0;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            ErrorResponse.Error responseError = ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).getResponseError();
            if (responseError instanceof ErrorResponse.Error.RateLimitExceededError) {
                return EnumC0543d.f1728s0;
            }
            boolean z6 = true;
            if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError ? true : responseError instanceof ErrorResponse.Error.InactiveTemplateError ? true : responseError instanceof ErrorResponse.Error.InconsistentTransitionError ? true : responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError ? true : responseError instanceof ErrorResponse.Error.InvalidConfigError ? true : responseError instanceof ErrorResponse.Error.UnauthenticatedError ? true : responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
                z6 = false;
            }
            if (z6) {
                return EnumC0543d.f1722Y;
            }
            throw new C0644w();
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return EnumC0543d.f1723Z;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
            return EnumC0543d.f1724o0;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
            return EnumC0543d.f1730u0;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
            return EnumC0543d.f1731v0;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
            return EnumC0543d.f1729t0;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: b */
    public static final String m5174b(InternalErrorInfo internalErrorInfo) {
        AbstractC16544l.m18094g(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return "Unable to find a suitable camera.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return "The SDK is misconfigured.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            return "There was a problem reaching the server.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return "There was an issue with camera permissions.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
            return "The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
            return "The device has no available disk space.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
            return "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
            return "An otherwise unexpected error occurred.";
        }
        throw new C0644w();
    }
}
